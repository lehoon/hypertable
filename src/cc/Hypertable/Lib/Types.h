/**
 * Copyright (C) 2007 Doug Judd (Zvents, Inc.)
 * 
 * This file is part of Hypertable.
 * 
 * Hypertable is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or any later version.
 * 
 * Hypertable is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

#ifndef HYPERTABLE_TYPES_H
#define HYPERTABLE_TYPES_H

#include <utility>
#include <vector>

extern "C" {
#include <stddef.h>
#include <stdint.h>
}

#include "Common/ByteString.h"

namespace hypertable {

  extern const uint16_t END_OF_SCAN;

  /**
   *
   */
  typedef struct {
    uint32_t generation;
    const char *tableName;
    const char *startRow;
    const char *endRow;
  } RangeSpecificationT;

  /**
   *
   */
  typedef struct {
    uint32_t rowLimit;
    uint32_t cellLimit;
    std::vector<const char *> columns;
    const char *startRow;
    const char *endRow;
    std::pair<uint64_t,uint64_t> interval;
  } ScanSpecificationT;

  typedef struct {
    int error;
    uint16_t flags;
    int id;
    uint32_t dataLen;
    uint8_t *data;
  } ScanResultT;

  typedef struct {
    uint8_t *buf;
    int32_t len;
  } BufferT;

  /** Serialization methods for RangeSpecificationT **/
  size_t EncodedLengthRangeSpecification(RangeSpecificationT &rangeSpec);
  void EncodeRangeSpecification(uint8_t **bufPtr, RangeSpecificationT &rangeSpec);
  bool DecodeRangeSpecification(uint8_t **bufPtr, size_t *remainingPtr, RangeSpecificationT *rangeSpec);

  /** Serialization methods for ScanSpecificationT **/
  size_t EncodedLengthScanSpecification(ScanSpecificationT &scanSpec);
  void EncodeScanSpecification(uint8_t **bufPtr, ScanSpecificationT &scanSpec);
  bool DecodeScanSpecification(uint8_t **bufPtr, size_t *remainingPtr, ScanSpecificationT *scanSpec);

  /** Serialization methods for ScanResultT **/
  bool DecodeScanResult(uint8_t **bufPtr, size_t *remainingPtr, ScanResultT *scanResult);

  std::ostream &operator<<(std::ostream &os, const RangeSpecificationT &rangeSpec);

  std::ostream &operator<<(std::ostream &os, const ScanSpecificationT &scannerSpec);

}


#endif // HYPERTABLE_REQUEST_H
