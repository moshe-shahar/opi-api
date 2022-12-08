// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: middleend.proto

package opi_api.storage.v1;

/**
 * Protobuf type {@code opi_api.storage.v1.EncryptedVolumeStatsResponse}
 */
public final class EncryptedVolumeStatsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.EncryptedVolumeStatsResponse)
    EncryptedVolumeStatsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncryptedVolumeStatsResponse.newBuilder() to construct.
  private EncryptedVolumeStatsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncryptedVolumeStatsResponse() {
    stats_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EncryptedVolumeStatsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncryptedVolumeStatsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (encryptedVolumeId_ != null) {
              subBuilder = encryptedVolumeId_.toBuilder();
            }
            encryptedVolumeId_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(encryptedVolumeId_);
              encryptedVolumeId_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            stats_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.EncryptedVolumeStatsResponse.class, opi_api.storage.v1.EncryptedVolumeStatsResponse.Builder.class);
  }

  public static final int ENCRYPTED_VOLUME_ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey encryptedVolumeId_;
  /**
   * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
   * @return Whether the encryptedVolumeId field is set.
   */
  @java.lang.Override
  public boolean hasEncryptedVolumeId() {
    return encryptedVolumeId_ != null;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
   * @return The encryptedVolumeId.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getEncryptedVolumeId() {
    return encryptedVolumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : encryptedVolumeId_;
  }
  /**
   * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getEncryptedVolumeIdOrBuilder() {
    return getEncryptedVolumeId();
  }

  public static final int STATS_FIELD_NUMBER = 2;
  private volatile java.lang.Object stats_;
  /**
   * <code>string stats = 2;</code>
   * @return The stats.
   */
  @java.lang.Override
  public java.lang.String getStats() {
    java.lang.Object ref = stats_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stats_ = s;
      return s;
    }
  }
  /**
   * <code>string stats = 2;</code>
   * @return The bytes for stats.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatsBytes() {
    java.lang.Object ref = stats_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stats_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (encryptedVolumeId_ != null) {
      output.writeMessage(1, getEncryptedVolumeId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stats_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stats_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (encryptedVolumeId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEncryptedVolumeId());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stats_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stats_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof opi_api.storage.v1.EncryptedVolumeStatsResponse)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.EncryptedVolumeStatsResponse other = (opi_api.storage.v1.EncryptedVolumeStatsResponse) obj;

    if (hasEncryptedVolumeId() != other.hasEncryptedVolumeId()) return false;
    if (hasEncryptedVolumeId()) {
      if (!getEncryptedVolumeId()
          .equals(other.getEncryptedVolumeId())) return false;
    }
    if (!getStats()
        .equals(other.getStats())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasEncryptedVolumeId()) {
      hash = (37 * hash) + ENCRYPTED_VOLUME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEncryptedVolumeId().hashCode();
    }
    hash = (37 * hash) + STATS_FIELD_NUMBER;
    hash = (53 * hash) + getStats().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.EncryptedVolumeStatsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(opi_api.storage.v1.EncryptedVolumeStatsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code opi_api.storage.v1.EncryptedVolumeStatsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.EncryptedVolumeStatsResponse)
      opi_api.storage.v1.EncryptedVolumeStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.EncryptedVolumeStatsResponse.class, opi_api.storage.v1.EncryptedVolumeStatsResponse.Builder.class);
    }

    // Construct using opi_api.storage.v1.EncryptedVolumeStatsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (encryptedVolumeIdBuilder_ == null) {
        encryptedVolumeId_ = null;
      } else {
        encryptedVolumeId_ = null;
        encryptedVolumeIdBuilder_ = null;
      }
      stats_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.MiddleendProto.internal_static_opi_api_storage_v1_EncryptedVolumeStatsResponse_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolumeStatsResponse getDefaultInstanceForType() {
      return opi_api.storage.v1.EncryptedVolumeStatsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolumeStatsResponse build() {
      opi_api.storage.v1.EncryptedVolumeStatsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.EncryptedVolumeStatsResponse buildPartial() {
      opi_api.storage.v1.EncryptedVolumeStatsResponse result = new opi_api.storage.v1.EncryptedVolumeStatsResponse(this);
      if (encryptedVolumeIdBuilder_ == null) {
        result.encryptedVolumeId_ = encryptedVolumeId_;
      } else {
        result.encryptedVolumeId_ = encryptedVolumeIdBuilder_.build();
      }
      result.stats_ = stats_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof opi_api.storage.v1.EncryptedVolumeStatsResponse) {
        return mergeFrom((opi_api.storage.v1.EncryptedVolumeStatsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.EncryptedVolumeStatsResponse other) {
      if (other == opi_api.storage.v1.EncryptedVolumeStatsResponse.getDefaultInstance()) return this;
      if (other.hasEncryptedVolumeId()) {
        mergeEncryptedVolumeId(other.getEncryptedVolumeId());
      }
      if (!other.getStats().isEmpty()) {
        stats_ = other.stats_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      opi_api.storage.v1.EncryptedVolumeStatsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.EncryptedVolumeStatsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey encryptedVolumeId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> encryptedVolumeIdBuilder_;
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     * @return Whether the encryptedVolumeId field is set.
     */
    public boolean hasEncryptedVolumeId() {
      return encryptedVolumeIdBuilder_ != null || encryptedVolumeId_ != null;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     * @return The encryptedVolumeId.
     */
    public opi_api.common.v1.ObjectKey getEncryptedVolumeId() {
      if (encryptedVolumeIdBuilder_ == null) {
        return encryptedVolumeId_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : encryptedVolumeId_;
      } else {
        return encryptedVolumeIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public Builder setEncryptedVolumeId(opi_api.common.v1.ObjectKey value) {
      if (encryptedVolumeIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        encryptedVolumeId_ = value;
        onChanged();
      } else {
        encryptedVolumeIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public Builder setEncryptedVolumeId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (encryptedVolumeIdBuilder_ == null) {
        encryptedVolumeId_ = builderForValue.build();
        onChanged();
      } else {
        encryptedVolumeIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public Builder mergeEncryptedVolumeId(opi_api.common.v1.ObjectKey value) {
      if (encryptedVolumeIdBuilder_ == null) {
        if (encryptedVolumeId_ != null) {
          encryptedVolumeId_ =
            opi_api.common.v1.ObjectKey.newBuilder(encryptedVolumeId_).mergeFrom(value).buildPartial();
        } else {
          encryptedVolumeId_ = value;
        }
        onChanged();
      } else {
        encryptedVolumeIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public Builder clearEncryptedVolumeId() {
      if (encryptedVolumeIdBuilder_ == null) {
        encryptedVolumeId_ = null;
        onChanged();
      } else {
        encryptedVolumeId_ = null;
        encryptedVolumeIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getEncryptedVolumeIdBuilder() {
      
      onChanged();
      return getEncryptedVolumeIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getEncryptedVolumeIdOrBuilder() {
      if (encryptedVolumeIdBuilder_ != null) {
        return encryptedVolumeIdBuilder_.getMessageOrBuilder();
      } else {
        return encryptedVolumeId_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : encryptedVolumeId_;
      }
    }
    /**
     * <code>.opi_api.common.v1.ObjectKey encrypted_volume_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getEncryptedVolumeIdFieldBuilder() {
      if (encryptedVolumeIdBuilder_ == null) {
        encryptedVolumeIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getEncryptedVolumeId(),
                getParentForChildren(),
                isClean());
        encryptedVolumeId_ = null;
      }
      return encryptedVolumeIdBuilder_;
    }

    private java.lang.Object stats_ = "";
    /**
     * <code>string stats = 2;</code>
     * @return The stats.
     */
    public java.lang.String getStats() {
      java.lang.Object ref = stats_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stats_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stats = 2;</code>
     * @return The bytes for stats.
     */
    public com.google.protobuf.ByteString
        getStatsBytes() {
      java.lang.Object ref = stats_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stats_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stats = 2;</code>
     * @param value The stats to set.
     * @return This builder for chaining.
     */
    public Builder setStats(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stats_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stats = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStats() {
      
      stats_ = getDefaultInstance().getStats();
      onChanged();
      return this;
    }
    /**
     * <code>string stats = 2;</code>
     * @param value The bytes for stats to set.
     * @return This builder for chaining.
     */
    public Builder setStatsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stats_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.EncryptedVolumeStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.EncryptedVolumeStatsResponse)
  private static final opi_api.storage.v1.EncryptedVolumeStatsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.EncryptedVolumeStatsResponse();
  }

  public static opi_api.storage.v1.EncryptedVolumeStatsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptedVolumeStatsResponse>
      PARSER = new com.google.protobuf.AbstractParser<EncryptedVolumeStatsResponse>() {
    @java.lang.Override
    public EncryptedVolumeStatsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncryptedVolumeStatsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncryptedVolumeStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptedVolumeStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.EncryptedVolumeStatsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
