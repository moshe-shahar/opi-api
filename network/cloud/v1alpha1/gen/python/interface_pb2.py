# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: interface.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import object_key_pb2 as object__key__pb2
import networktypes_pb2 as networktypes__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0finterface.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x10object_key.proto\x1a\x12networktypes.proto\"\x89\x01\n\tInterface\x12;\n\x04spec\x18\x01 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.InterfaceSpec\x12?\n\x06status\x18\x02 \x01(\x0b\x32/.opi_api.network.cloud.v1alpha1.InterfaceStatus\"\xb6\x04\n\rInterfaceSpec\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0c\n\x04ifid\x18\x02 \x01(\x05\x12>\n\x0c\x61\x64min_status\x18\x03 \x01(\x0e\x32(.opi_api.network.cloud.v1alpha1.IfStatus\x12\x41\n\x0buplink_spec\x18\x04 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.UplinkSpecH\x00\x12\x46\n\x0euplink_pc_spec\x18\x05 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.UplinkPCSpecH\x00\x12>\n\nl3_if_spec\x18\x06 \x01(\x0b\x32(.opi_api.network.cloud.v1alpha1.L3IfSpecH\x00\x12J\n\x10loopback_if_spec\x18\x07 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.LoopbackIfSpecH\x00\x12H\n\x0f\x63ontrol_if_spec\x18\x08 \x01(\x0b\x32-.opi_api.network.cloud.v1alpha1.ControlIfSpecH\x00\x12\x42\n\x0chost_if_spec\x18\t \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.HostIfSpecH\x00\x42\x08\n\x06ifinfo\"R\n\nUplinkSpec\x12-\n\x07port_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x15\n\rnative_vlanid\x18\x02 \x01(\x05\"B\n\x0cUplinkPCSpec\x12\x1b\n\x13member_ifids_bitmap\x18\x01 \x01(\x04\x12\x15\n\rnative_vlanid\x18\x02 \x01(\x05\"\xfa\x01\n\x08L3IfSpec\x12,\n\x06vpc_id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12-\n\x07port_id\x18\x03 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12?\n\x06prefix\x18\x02 \x03(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefix\x12;\n\x05\x65ncap\x18\x04 \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.Encap\x12\x13\n\x0bmac_address\x18\x05 \x01(\x0c\".\n\x0c\x42GPCommunity\x12\x0b\n\x03\x61sn\x18\x01 \x01(\x05\x12\x11\n\tcommunity\x18\x02 \x01(\x05\"\x94\x01\n\x0eLoopbackIfSpec\x12?\n\x06prefix\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefix\x12\x41\n\x0b\x63ommunities\x18\x02 \x03(\x0b\x32,.opi_api.network.cloud.v1alpha1.BGPCommunity\"e\n\rControlIfSpec\x12?\n\x06prefix\x18\x01 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefix\x12\x13\n\x0bmac_address\x18\x02 \x01(\x0c\"a\n\nHostIfSpec\x12\n\n\x02vf\x18\x01 \x01(\x08\x12\"\n\x1a\x65nable_connection_tracking\x18\x02 \x01(\x08\x12\x13\n\x0bmac_address\x18\x03 \x01(\x0c\x12\x0e\n\x06ifname\x18\x04 \x01(\t\";\n\x0eUplinkIfStatus\x12\x11\n\thw_if_idx\x18\x01 \x01(\x05\x12\x16\n\x0ehw_port_number\x18\x02 \x01(\x05\"\"\n\x10LoopbackIfStatus\x12\x0e\n\x06ifname\x18\x01 \x01(\t\"\x82\x01\n\x0cHostIfStatus\x12\x13\n\x0bhw_if_idxes\x18\x01 \x03(\x0c\x12\x13\n\x0bmac_address\x18\x02 \x01(\x0c\x12\x38\n\x06status\x18\x03 \x01(\x0e\x32(.opi_api.network.cloud.v1alpha1.IfStatus\x12\x0e\n\x06ifname\x18\x04 \x01(\t\"\xd2\x02\n\x0fInterfaceStatus\x12\x10\n\x08if_index\x18\x01 \x01(\r\x12=\n\x0boper_status\x18\x02 \x01(\x0e\x32(.opi_api.network.cloud.v1alpha1.IfStatus\x12J\n\x10uplink_if_status\x18\x03 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.UplinkIfStatusH\x00\x12N\n\x12loopback_if_status\x18\x04 \x01(\x0b\x32\x30.opi_api.network.cloud.v1alpha1.LoopbackIfStatusH\x00\x12\x46\n\x0ehost_if_status\x18\x05 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.HostIfStatusH\x00\x42\n\n\x08ifstatus*\x99\x01\n\x06IfType\x12\x17\n\x13IF_TYPE_UNSPECIFIED\x10\x00\x12\x12\n\x0eIF_TYPE_UPLINK\x10\x01\x12\x15\n\x11IF_TYPE_UPLINK_PC\x10\x02\x12\x0e\n\nIF_TYPE_L3\x10\x03\x12\x14\n\x10IF_TYPE_LOOPBACK\x10\x04\x12\x13\n\x0fIF_TYPE_CONTROL\x10\x05\x12\x10\n\x0cIF_TYPE_HOST\x10\x06*K\n\x08IfStatus\x12\x19\n\x15IF_STATUS_UNSPECIFIED\x10\x00\x12\x10\n\x0cIF_STATUS_UP\x10\x01\x12\x12\n\x0eIF_STATUS_DOWN\x10\x02\x42o\n\x1eopi_api.network.cloud.v1alpha1B\x0eInterfaceProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_IFTYPE = DESCRIPTOR.enum_types_by_name['IfType']
IfType = enum_type_wrapper.EnumTypeWrapper(_IFTYPE)
_IFSTATUS = DESCRIPTOR.enum_types_by_name['IfStatus']
IfStatus = enum_type_wrapper.EnumTypeWrapper(_IFSTATUS)
IF_TYPE_UNSPECIFIED = 0
IF_TYPE_UPLINK = 1
IF_TYPE_UPLINK_PC = 2
IF_TYPE_L3 = 3
IF_TYPE_LOOPBACK = 4
IF_TYPE_CONTROL = 5
IF_TYPE_HOST = 6
IF_STATUS_UNSPECIFIED = 0
IF_STATUS_UP = 1
IF_STATUS_DOWN = 2


_INTERFACE = DESCRIPTOR.message_types_by_name['Interface']
_INTERFACESPEC = DESCRIPTOR.message_types_by_name['InterfaceSpec']
_UPLINKSPEC = DESCRIPTOR.message_types_by_name['UplinkSpec']
_UPLINKPCSPEC = DESCRIPTOR.message_types_by_name['UplinkPCSpec']
_L3IFSPEC = DESCRIPTOR.message_types_by_name['L3IfSpec']
_BGPCOMMUNITY = DESCRIPTOR.message_types_by_name['BGPCommunity']
_LOOPBACKIFSPEC = DESCRIPTOR.message_types_by_name['LoopbackIfSpec']
_CONTROLIFSPEC = DESCRIPTOR.message_types_by_name['ControlIfSpec']
_HOSTIFSPEC = DESCRIPTOR.message_types_by_name['HostIfSpec']
_UPLINKIFSTATUS = DESCRIPTOR.message_types_by_name['UplinkIfStatus']
_LOOPBACKIFSTATUS = DESCRIPTOR.message_types_by_name['LoopbackIfStatus']
_HOSTIFSTATUS = DESCRIPTOR.message_types_by_name['HostIfStatus']
_INTERFACESTATUS = DESCRIPTOR.message_types_by_name['InterfaceStatus']
Interface = _reflection.GeneratedProtocolMessageType('Interface', (_message.Message,), {
  'DESCRIPTOR' : _INTERFACE,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.Interface)
  })
_sym_db.RegisterMessage(Interface)

InterfaceSpec = _reflection.GeneratedProtocolMessageType('InterfaceSpec', (_message.Message,), {
  'DESCRIPTOR' : _INTERFACESPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.InterfaceSpec)
  })
_sym_db.RegisterMessage(InterfaceSpec)

UplinkSpec = _reflection.GeneratedProtocolMessageType('UplinkSpec', (_message.Message,), {
  'DESCRIPTOR' : _UPLINKSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UplinkSpec)
  })
_sym_db.RegisterMessage(UplinkSpec)

UplinkPCSpec = _reflection.GeneratedProtocolMessageType('UplinkPCSpec', (_message.Message,), {
  'DESCRIPTOR' : _UPLINKPCSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UplinkPCSpec)
  })
_sym_db.RegisterMessage(UplinkPCSpec)

L3IfSpec = _reflection.GeneratedProtocolMessageType('L3IfSpec', (_message.Message,), {
  'DESCRIPTOR' : _L3IFSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.L3IfSpec)
  })
_sym_db.RegisterMessage(L3IfSpec)

BGPCommunity = _reflection.GeneratedProtocolMessageType('BGPCommunity', (_message.Message,), {
  'DESCRIPTOR' : _BGPCOMMUNITY,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.BGPCommunity)
  })
_sym_db.RegisterMessage(BGPCommunity)

LoopbackIfSpec = _reflection.GeneratedProtocolMessageType('LoopbackIfSpec', (_message.Message,), {
  'DESCRIPTOR' : _LOOPBACKIFSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.LoopbackIfSpec)
  })
_sym_db.RegisterMessage(LoopbackIfSpec)

ControlIfSpec = _reflection.GeneratedProtocolMessageType('ControlIfSpec', (_message.Message,), {
  'DESCRIPTOR' : _CONTROLIFSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.ControlIfSpec)
  })
_sym_db.RegisterMessage(ControlIfSpec)

HostIfSpec = _reflection.GeneratedProtocolMessageType('HostIfSpec', (_message.Message,), {
  'DESCRIPTOR' : _HOSTIFSPEC,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.HostIfSpec)
  })
_sym_db.RegisterMessage(HostIfSpec)

UplinkIfStatus = _reflection.GeneratedProtocolMessageType('UplinkIfStatus', (_message.Message,), {
  'DESCRIPTOR' : _UPLINKIFSTATUS,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UplinkIfStatus)
  })
_sym_db.RegisterMessage(UplinkIfStatus)

LoopbackIfStatus = _reflection.GeneratedProtocolMessageType('LoopbackIfStatus', (_message.Message,), {
  'DESCRIPTOR' : _LOOPBACKIFSTATUS,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.LoopbackIfStatus)
  })
_sym_db.RegisterMessage(LoopbackIfStatus)

HostIfStatus = _reflection.GeneratedProtocolMessageType('HostIfStatus', (_message.Message,), {
  'DESCRIPTOR' : _HOSTIFSTATUS,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.HostIfStatus)
  })
_sym_db.RegisterMessage(HostIfStatus)

InterfaceStatus = _reflection.GeneratedProtocolMessageType('InterfaceStatus', (_message.Message,), {
  'DESCRIPTOR' : _INTERFACESTATUS,
  '__module__' : 'interface_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.InterfaceStatus)
  })
_sym_db.RegisterMessage(InterfaceStatus)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\016InterfaceProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _IFTYPE._serialized_start=2176
  _IFTYPE._serialized_end=2329
  _IFSTATUS._serialized_start=2331
  _IFSTATUS._serialized_end=2406
  _INTERFACE._serialized_start=90
  _INTERFACE._serialized_end=227
  _INTERFACESPEC._serialized_start=230
  _INTERFACESPEC._serialized_end=796
  _UPLINKSPEC._serialized_start=798
  _UPLINKSPEC._serialized_end=880
  _UPLINKPCSPEC._serialized_start=882
  _UPLINKPCSPEC._serialized_end=948
  _L3IFSPEC._serialized_start=951
  _L3IFSPEC._serialized_end=1201
  _BGPCOMMUNITY._serialized_start=1203
  _BGPCOMMUNITY._serialized_end=1249
  _LOOPBACKIFSPEC._serialized_start=1252
  _LOOPBACKIFSPEC._serialized_end=1400
  _CONTROLIFSPEC._serialized_start=1402
  _CONTROLIFSPEC._serialized_end=1503
  _HOSTIFSPEC._serialized_start=1505
  _HOSTIFSPEC._serialized_end=1602
  _UPLINKIFSTATUS._serialized_start=1604
  _UPLINKIFSTATUS._serialized_end=1663
  _LOOPBACKIFSTATUS._serialized_start=1665
  _LOOPBACKIFSTATUS._serialized_end=1699
  _HOSTIFSTATUS._serialized_start=1702
  _HOSTIFSTATUS._serialized_end=1832
  _INTERFACESTATUS._serialized_start=1835
  _INTERFACESTATUS._serialized_end=2173
# @@protoc_insertion_point(module_scope)
