// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: backend_null.proto

package opi_api.storage.v1;

public interface CreateNullDebugRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.storage.v1.CreateNullDebugRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.storage.v1.NullDebug null_debug = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the nullDebug field is set.
   */
  boolean hasNullDebug();
  /**
   * <code>.opi_api.storage.v1.NullDebug null_debug = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The nullDebug.
   */
  opi_api.storage.v1.NullDebug getNullDebug();
  /**
   * <code>.opi_api.storage.v1.NullDebug null_debug = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  opi_api.storage.v1.NullDebugOrBuilder getNullDebugOrBuilder();

  /**
   * <code>string null_debug_id = 3;</code>
   * @return The nullDebugId.
   */
  java.lang.String getNullDebugId();
  /**
   * <code>string null_debug_id = 3;</code>
   * @return The bytes for nullDebugId.
   */
  com.google.protobuf.ByteString
      getNullDebugIdBytes();
}
