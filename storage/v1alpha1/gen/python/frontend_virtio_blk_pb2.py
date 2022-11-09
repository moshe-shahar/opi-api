# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: frontend_virtio_blk.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import common_pb2 as common__pb2
from google.protobuf import empty_pb2 as google_dot_protobuf_dot_empty__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19\x66rontend_virtio_blk.proto\x12\x12opi_api.storage.v1\x1a\x0c\x63ommon.proto\x1a\x1bgoogle/protobuf/empty.proto\x1a\x1cgoogle/api/annotations.proto\"\x8a\x01\n\tVirtioBlk\x12\n\n\x02id\x18\x01 \x01(\x03\x12\x38\n\x07pcie_id\x18\x02 \x01(\x0b\x32\'.opi_api.storage.v1.NvmeControllerPciId\x12\x0c\n\x04\x62\x64\x65v\x18\x03 \x01(\t\x12\x12\n\nmax_io_qps\x18\x04 \x01(\x03\x12\x15\n\rserial_number\x18\x05 \x01(\t\"K\n\x16VirtioBlkCreateRequest\x12\x31\n\ncontroller\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\"/\n\x16VirtioBlkDeleteRequest\x12\x15\n\rcontroller_id\x18\x01 \x01(\x03\"K\n\x16VirtioBlkUpdateRequest\x12\x31\n\ncontroller\x18\x01 \x01(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\",\n\x14VirtioBlkListRequest\x12\x14\n\x0cvirtioblk_id\x18\x01 \x01(\x03\"J\n\x15VirtioBlkListResponse\x12\x31\n\ncontroller\x18\x01 \x03(\x0b\x32\x1d.opi_api.storage.v1.VirtioBlk\",\n\x13VirtioBlkGetRequest\x12\x15\n\rcontroller_id\x18\x01 \x01(\x03\".\n\x15VirtioBlkStatsRequest\x12\x15\n\rcontroller_id\x18\x01 \x01(\x03\"3\n\x16VirtioBlkStatsResponse\x12\n\n\x02id\x18\x01 \x01(\x03\x12\r\n\x05stats\x18\x02 \x01(\t2\xfc\x05\n\x18\x46rontendVirtioBlkService\x12\x7f\n\x0fVirtioBlkCreate\x12*.opi_api.storage.v1.VirtioBlkCreateRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"!\x82\xd3\xe4\x93\x02\x1b\"\x0e/v1/virtioblks:\tvirtioblk\x12y\n\x0fVirtioBlkDelete\x12*.opi_api.storage.v1.VirtioBlkDeleteRequest\x1a\x16.google.protobuf.Empty\"\"\x82\xd3\xe4\x93\x02\x1c*\x1a/v1/virtioblks/{virtioblk}\x12\x7f\n\x0fVirtioBlkUpdate\x12*.opi_api.storage.v1.VirtioBlkUpdateRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"!\x82\xd3\xe4\x93\x02\x1b\x32\x0e/v1/virtioblks:\tvirtioblk\x12|\n\rVirtioBlkList\x12(.opi_api.storage.v1.VirtioBlkListRequest\x1a).opi_api.storage.v1.VirtioBlkListResponse\"\x16\x82\xd3\xe4\x93\x02\x10\x12\x0e/v1/virtioblks\x12z\n\x0cVirtioBlkGet\x12\'.opi_api.storage.v1.VirtioBlkGetRequest\x1a\x1d.opi_api.storage.v1.VirtioBlk\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/v1/virtioblks/{virtioblk}\x12i\n\x0eVirtioBlkStats\x12).opi_api.storage.v1.VirtioBlkStatsRequest\x1a*.opi_api.storage.v1.VirtioBlkStatsResponse\"\x00\x42\x65\n\x12opi_api.storage.v1B\x16\x46rontendVirtioBlkProtoP\x01Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/gob\x06proto3')



_VIRTIOBLK = DESCRIPTOR.message_types_by_name['VirtioBlk']
_VIRTIOBLKCREATEREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkCreateRequest']
_VIRTIOBLKDELETEREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkDeleteRequest']
_VIRTIOBLKUPDATEREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkUpdateRequest']
_VIRTIOBLKLISTREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkListRequest']
_VIRTIOBLKLISTRESPONSE = DESCRIPTOR.message_types_by_name['VirtioBlkListResponse']
_VIRTIOBLKGETREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkGetRequest']
_VIRTIOBLKSTATSREQUEST = DESCRIPTOR.message_types_by_name['VirtioBlkStatsRequest']
_VIRTIOBLKSTATSRESPONSE = DESCRIPTOR.message_types_by_name['VirtioBlkStatsResponse']
VirtioBlk = _reflection.GeneratedProtocolMessageType('VirtioBlk', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLK,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlk)
  })
_sym_db.RegisterMessage(VirtioBlk)

VirtioBlkCreateRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkCreateRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKCREATEREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkCreateRequest)
  })
_sym_db.RegisterMessage(VirtioBlkCreateRequest)

VirtioBlkDeleteRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkDeleteRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKDELETEREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkDeleteRequest)
  })
_sym_db.RegisterMessage(VirtioBlkDeleteRequest)

VirtioBlkUpdateRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkUpdateRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKUPDATEREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkUpdateRequest)
  })
_sym_db.RegisterMessage(VirtioBlkUpdateRequest)

VirtioBlkListRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkListRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKLISTREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkListRequest)
  })
_sym_db.RegisterMessage(VirtioBlkListRequest)

VirtioBlkListResponse = _reflection.GeneratedProtocolMessageType('VirtioBlkListResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKLISTRESPONSE,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkListResponse)
  })
_sym_db.RegisterMessage(VirtioBlkListResponse)

VirtioBlkGetRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkGetRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKGETREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkGetRequest)
  })
_sym_db.RegisterMessage(VirtioBlkGetRequest)

VirtioBlkStatsRequest = _reflection.GeneratedProtocolMessageType('VirtioBlkStatsRequest', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKSTATSREQUEST,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkStatsRequest)
  })
_sym_db.RegisterMessage(VirtioBlkStatsRequest)

VirtioBlkStatsResponse = _reflection.GeneratedProtocolMessageType('VirtioBlkStatsResponse', (_message.Message,), {
  'DESCRIPTOR' : _VIRTIOBLKSTATSRESPONSE,
  '__module__' : 'frontend_virtio_blk_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.storage.v1.VirtioBlkStatsResponse)
  })
_sym_db.RegisterMessage(VirtioBlkStatsResponse)

_FRONTENDVIRTIOBLKSERVICE = DESCRIPTOR.services_by_name['FrontendVirtioBlkService']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022opi_api.storage.v1B\026FrontendVirtioBlkProtoP\001Z5github.com/opiproject/opi-api/storage/v1alpha1/gen/go'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkCreate']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkCreate']._serialized_options = b'\202\323\344\223\002\033\"\016/v1/virtioblks:\tvirtioblk'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkDelete']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkDelete']._serialized_options = b'\202\323\344\223\002\034*\032/v1/virtioblks/{virtioblk}'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkUpdate']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkUpdate']._serialized_options = b'\202\323\344\223\002\0332\016/v1/virtioblks:\tvirtioblk'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkList']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkList']._serialized_options = b'\202\323\344\223\002\020\022\016/v1/virtioblks'
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkGet']._options = None
  _FRONTENDVIRTIOBLKSERVICE.methods_by_name['VirtioBlkGet']._serialized_options = b'\202\323\344\223\002\034\022\032/v1/virtioblks/{virtioblk}'
  _VIRTIOBLK._serialized_start=123
  _VIRTIOBLK._serialized_end=261
  _VIRTIOBLKCREATEREQUEST._serialized_start=263
  _VIRTIOBLKCREATEREQUEST._serialized_end=338
  _VIRTIOBLKDELETEREQUEST._serialized_start=340
  _VIRTIOBLKDELETEREQUEST._serialized_end=387
  _VIRTIOBLKUPDATEREQUEST._serialized_start=389
  _VIRTIOBLKUPDATEREQUEST._serialized_end=464
  _VIRTIOBLKLISTREQUEST._serialized_start=466
  _VIRTIOBLKLISTREQUEST._serialized_end=510
  _VIRTIOBLKLISTRESPONSE._serialized_start=512
  _VIRTIOBLKLISTRESPONSE._serialized_end=586
  _VIRTIOBLKGETREQUEST._serialized_start=588
  _VIRTIOBLKGETREQUEST._serialized_end=632
  _VIRTIOBLKSTATSREQUEST._serialized_start=634
  _VIRTIOBLKSTATSREQUEST._serialized_end=680
  _VIRTIOBLKSTATSRESPONSE._serialized_start=682
  _VIRTIOBLKSTATSRESPONSE._serialized_end=733
  _FRONTENDVIRTIOBLKSERVICE._serialized_start=736
  _FRONTENDVIRTIOBLKSERVICE._serialized_end=1500
# @@protoc_insertion_point(module_scope)