# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: subnet.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import object_key_pb2 as object__key__pb2
import networktypes_pb2 as networktypes__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0csubnet.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x10object_key.proto\x1a\x12networktypes.proto\"\x80\x01\n\x06Subnet\x12\x38\n\x04spec\x18\x03 \x01(\x0b\x32*.opi_api.network.cloud.v1alpha1.SubnetSpec\x12<\n\x06status\x18\x04 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.SubnetStatus\"\xc9\x08\n\nSubnetSpec\x12(\n\x02id\x18\x01 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12,\n\x06vpc_id\x18\x02 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x44\n\tv4_prefix\x18\x03 \x01(\x0b\x32\x31.opi_api.network.opinetcommon.v1alpha1.IPv4Prefix\x12\x44\n\tv6_prefix\x18\x04 \x01(\x0b\x32\x31.opi_api.network.opinetcommon.v1alpha1.IPv6Prefix\x12\x1e\n\x16ipv4_virtual_router_ip\x18\x05 \x01(\r\x12\x1e\n\x16ipv6_virtual_router_ip\x18\x06 \x01(\x0c\x12\x1a\n\x12virtual_router_mac\x18\x07 \x01(\x0c\x12\x37\n\x11v4_route_table_id\x18\x08 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x38\n\x12v6_router_table_id\x18\t \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x42\n\x1cingess_v4_security_policy_id\x18\n \x03(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x43\n\x1dingress_v6_security_policy_id\x18\x0b \x03(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x42\n\x1c\x65gress_v4_security_policy_id\x18\x0c \x03(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x42\n\x1c\x65gress_v6_security_policy_id\x18\r \x03(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x42\n\x0c\x61\x63\x63\x65ss_encap\x18\x0e \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.Encap\x12\x42\n\x0c\x66\x61\x62ric_encap\x18\x0f \x01(\x0b\x32,.opi_api.network.opinetcommon.v1alpha1.Encap\x12\x37\n\x11host_interface_id\x18\x10 \x03(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x0b\n\x03tos\x18\x12 \x01(\x05\x12\x11\n\tconnected\x18\x13 \x01(\x08\x12?\n\x19ingress_default_sg_policy\x18\x14 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12>\n\x18\x65gress_default_sg_policy\x18\x15 \x01(\x0b\x32\x1c.opi_api.common.v1.ObjectKey\x12\x15\n\rremote_subnet\x18\x16 \x01(\x08\"4\n\x0cSubnetStatus\x12\x10\n\x08hw_index\x18\x01 \x01(\x05\x12\x12\n\nvnic_count\x18\x02 \x01(\x05\x42l\n\x1eopi_api.network.cloud.v1alpha1B\x0bSubnetProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')



_SUBNET = DESCRIPTOR.message_types_by_name['Subnet']
_SUBNETSPEC = DESCRIPTOR.message_types_by_name['SubnetSpec']
_SUBNETSTATUS = DESCRIPTOR.message_types_by_name['SubnetStatus']
Subnet = _reflection.GeneratedProtocolMessageType('Subnet', (_message.Message,), {
  'DESCRIPTOR' : _SUBNET,
  '__module__' : 'subnet_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.Subnet)
  })
_sym_db.RegisterMessage(Subnet)

SubnetSpec = _reflection.GeneratedProtocolMessageType('SubnetSpec', (_message.Message,), {
  'DESCRIPTOR' : _SUBNETSPEC,
  '__module__' : 'subnet_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SubnetSpec)
  })
_sym_db.RegisterMessage(SubnetSpec)

SubnetStatus = _reflection.GeneratedProtocolMessageType('SubnetStatus', (_message.Message,), {
  'DESCRIPTOR' : _SUBNETSTATUS,
  '__module__' : 'subnet_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.SubnetStatus)
  })
_sym_db.RegisterMessage(SubnetStatus)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\013SubnetProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _SUBNET._serialized_start=87
  _SUBNET._serialized_end=215
  _SUBNETSPEC._serialized_start=218
  _SUBNETSPEC._serialized_end=1315
  _SUBNETSTATUS._serialized_start=1317
  _SUBNETSTATUS._serialized_end=1369
# @@protoc_insertion_point(module_scope)
