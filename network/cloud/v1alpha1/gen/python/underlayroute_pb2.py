# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: underlayroute.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x13underlayroute.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x12networktypes.proto\x1a\x19google/api/resource.proto\"\x8a\x02\n\rUnderlayRoute\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x45\n\x04spec\x18\x02 \x01(\x0b\x32\x31.opi_api.network.cloud.v1alpha1.UnderlayRouteSpecR\x04spec\x12K\n\x06status\x18\x03 \x01(\x0b\x32\x33.opi_api.network.cloud.v1alpha1.UnderlayRouteStatusR\x06status:Q\xea\x41N\n,opi_api.network.cloud.v1alpha1/underlayroute\x12\x1eunderlayroutes/{underlayroute}\"\xbc\x03\n\x11UnderlayRouteSpec\x12/\n\x14route_table_name_ref\x18\x01 \x01(\tR\x11routeTableNameRef\x12P\n\x0b\x64\x65st_prefix\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\ndestPrefix\x12Z\n\x10next_hop_address\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0enextHopAddress\x12G\n\x05state\x18\x04 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateR\x05state\x12\x32\n\x15\x65nable_admin_distance\x18\x05 \x01(\x08R\x13\x65nableAdminDistance\x12\x1d\n\nadmin_dist\x18\x06 \x01(\x05R\tadminDist\x12,\n\x12interface_name_ref\x18\x07 \x01(\tR\x10interfaceNameRef\"\xad\x04\n\x13UnderlayRouteStatus\x12/\n\x14route_table_name_ref\x18\x01 \x01(\x05R\x11routeTableNameRef\x12P\n\x0b\x64\x65st_prefix\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\ndestPrefix\x12Z\n\x10next_hop_address\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0enextHopAddress\x12\x19\n\x08if_index\x18\x05 \x01(\x05R\x07ifIndex\x12\x44\n\x04type\x18\x06 \x01(\x0e\x32\x30.opi_api.network.opinetcommon.v1alpha1.RouteTypeR\x04type\x12J\n\x05proto\x18\x07 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.RouteProtocolR\x05proto\x12\x10\n\x03\x61ge\x18\x08 \x01(\x05R\x03\x61ge\x12\x16\n\x06metric\x18\t \x01(\x05R\x06metric\x12\x1b\n\tfib_route\x18\n \x01(\x08R\x08\x66ibRoute\x12\x1c\n\tconnected\x18\x0b \x01(\x08R\tconnected\x12%\n\x0e\x61\x64min_distance\x18\x0c \x01(\x05R\radminDistance\"\xd7\x02\n\x16UnderlayRouteLookupKey\x12/\n\x14route_table_name_ref\x18\x01 \x01(\tR\x11routeTableNameRef\x12P\n\x0b\x64\x65st_prefix\x18\x02 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\ndestPrefix\x12Z\n\x10next_hop_address\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0enextHopAddress\x12\x12\n\x04ifid\x18\x04 \x01(\x05R\x04ifid\x12J\n\x05proto\x18\x06 \x01(\x0e\x32\x34.opi_api.network.opinetcommon.v1alpha1.RouteProtocolR\x05protoBs\n\x1eopi_api.network.cloud.v1alpha1B\x12UnderlayRouteProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'underlayroute_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\022UnderlayRouteProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_UNDERLAYROUTE']._options = None
  _globals['_UNDERLAYROUTE']._serialized_options = b'\352AN\n,opi_api.network.cloud.v1alpha1/underlayroute\022\036underlayroutes/{underlayroute}'
  _globals['_UNDERLAYROUTE']._serialized_start=103
  _globals['_UNDERLAYROUTE']._serialized_end=369
  _globals['_UNDERLAYROUTESPEC']._serialized_start=372
  _globals['_UNDERLAYROUTESPEC']._serialized_end=816
  _globals['_UNDERLAYROUTESTATUS']._serialized_start=819
  _globals['_UNDERLAYROUTESTATUS']._serialized_end=1376
  _globals['_UNDERLAYROUTELOOKUPKEY']._serialized_start=1379
  _globals['_UNDERLAYROUTELOOKUPKEY']._serialized_end=1722
# @@protoc_insertion_point(module_scope)
