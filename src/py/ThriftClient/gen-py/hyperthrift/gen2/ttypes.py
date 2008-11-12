#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

from thrift.Thrift import *
import hyperthrift.gen.ttypes


from thrift.transport import TTransport
from thrift.protocol import TBinaryProtocol
try:
  from thrift.protocol import fastbinary
except:
  fastbinary = None


class HqlResult:

  thrift_spec = (
    None, # 0
    (1, TType.LIST, 'results', (TType.STRING,None), None, ), # 1
    (2, TType.LIST, 'cells', (TType.STRUCT,(hyperthrift.gen.ttypes.Cell, hyperthrift.gen.ttypes.Cell.thrift_spec)), None, ), # 2
    (3, TType.I64, 'scanner', None, None, ), # 3
    (4, TType.I64, 'mutator', None, None, ), # 4
  )

  def __init__(self, d=None):
    self.results = None
    self.cells = None
    self.scanner = None
    self.mutator = None
    if isinstance(d, dict):
      if 'results' in d:
        self.results = d['results']
      if 'cells' in d:
        self.cells = d['cells']
      if 'scanner' in d:
        self.scanner = d['scanner']
      if 'mutator' in d:
        self.mutator = d['mutator']

  def read(self, iprot):
    if iprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and isinstance(iprot.trans, TTransport.CReadableTransport) and self.thrift_spec is not None and fastbinary is not None:
      fastbinary.decode_binary(self, iprot.trans, (self.__class__, self.thrift_spec))
      return
    iprot.readStructBegin()
    while True:
      (fname, ftype, fid) = iprot.readFieldBegin()
      if ftype == TType.STOP:
        break
      if fid == 1:
        if ftype == TType.LIST:
          self.results = []
          (_etype3, _size0) = iprot.readListBegin()
          for _i4 in xrange(_size0):
            _elem5 = iprot.readString();
            self.results.append(_elem5)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 2:
        if ftype == TType.LIST:
          self.cells = []
          (_etype9, _size6) = iprot.readListBegin()
          for _i10 in xrange(_size6):
            _elem11 = hyperthrift.gen.ttypes.Cell()
            _elem11.read(iprot)
            self.cells.append(_elem11)
          iprot.readListEnd()
        else:
          iprot.skip(ftype)
      elif fid == 3:
        if ftype == TType.I64:
          self.scanner = iprot.readI64();
        else:
          iprot.skip(ftype)
      elif fid == 4:
        if ftype == TType.I64:
          self.mutator = iprot.readI64();
        else:
          iprot.skip(ftype)
      else:
        iprot.skip(ftype)
      iprot.readFieldEnd()
    iprot.readStructEnd()

  def write(self, oprot):
    if oprot.__class__ == TBinaryProtocol.TBinaryProtocolAccelerated and self.thrift_spec is not None and fastbinary is not None:
      oprot.trans.write(fastbinary.encode_binary(self, (self.__class__, self.thrift_spec)))
      return
    oprot.writeStructBegin('HqlResult')
    if self.results != None:
      oprot.writeFieldBegin('results', TType.LIST, 1)
      oprot.writeListBegin(TType.STRING, len(self.results))
      for iter12 in self.results:
        oprot.writeString(iter12)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.cells != None:
      oprot.writeFieldBegin('cells', TType.LIST, 2)
      oprot.writeListBegin(TType.STRUCT, len(self.cells))
      for iter13 in self.cells:
        iter13.write(oprot)
      oprot.writeListEnd()
      oprot.writeFieldEnd()
    if self.scanner != None:
      oprot.writeFieldBegin('scanner', TType.I64, 3)
      oprot.writeI64(self.scanner)
      oprot.writeFieldEnd()
    if self.mutator != None:
      oprot.writeFieldBegin('mutator', TType.I64, 4)
      oprot.writeI64(self.mutator)
      oprot.writeFieldEnd()
    oprot.writeFieldStop()
    oprot.writeStructEnd()

  def __str__(self):
    return str(self.__dict__)

  def __repr__(self):
    return repr(self.__dict__)

  def __eq__(self, other):
    return isinstance(other, self.__class__) and self.__dict__ == other.__dict__

  def __ne__(self, other):
    return not (self == other)

