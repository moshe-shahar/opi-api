// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: frontend_nvme.proto

package opi_api.storage.v1;

/**
 * <pre>
 * Represents Nvme Namespace configuration
 * </pre>
 *
 * Protobuf type {@code opi_api.storage.v1.NvmeNamespaceSpec}
 */
public final class NvmeNamespaceSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.storage.v1.NvmeNamespaceSpec)
    NvmeNamespaceSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NvmeNamespaceSpec.newBuilder() to construct.
  private NvmeNamespaceSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NvmeNamespaceSpec() {
    nguid_ = "";
    volumeNameRef_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NvmeNamespaceSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NvmeNamespaceSpec(
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
          case 16: {

            hostNsid_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            nguid_ = s;
            break;
          }
          case 32: {

            eui64_ = input.readInt64();
            break;
          }
          case 42: {
            opi_api.common.v1.Uuid.Builder subBuilder = null;
            if (uuid_ != null) {
              subBuilder = uuid_.toBuilder();
            }
            uuid_ = input.readMessage(opi_api.common.v1.Uuid.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uuid_);
              uuid_ = subBuilder.buildPartial();
            }

            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            volumeNameRef_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_NvmeNamespaceSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_NvmeNamespaceSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.storage.v1.NvmeNamespaceSpec.class, opi_api.storage.v1.NvmeNamespaceSpec.Builder.class);
  }

  public static final int HOST_NSID_FIELD_NUMBER = 2;
  private int hostNsid_;
  /**
   * <pre>
   * NSID presented by the Nvme controller.
   * If not provided, then the controller will assign an unused NSID
   * within the max namespace range - auto assigned nsid may not work
   * for live migration
   * </pre>
   *
   * <code>int32 host_nsid = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The hostNsid.
   */
  @java.lang.Override
  public int getHostNsid() {
    return hostNsid_;
  }

  public static final int NGUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object nguid_;
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The nguid.
   */
  @java.lang.Override
  public java.lang.String getNguid() {
    java.lang.Object ref = nguid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nguid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for nguid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNguidBytes() {
    java.lang.Object ref = nguid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nguid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EUI64_FIELD_NUMBER = 4;
  private long eui64_;
  /**
   * <pre>
   * 64bit Extended unique identifier for the namespace
   * mandatory if guid is not specified
   * </pre>
   *
   * <code>int64 eui64 = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The eui64.
   */
  @java.lang.Override
  public long getEui64() {
    return eui64_;
  }

  public static final int UUID_FIELD_NUMBER = 5;
  private opi_api.common.v1.Uuid uuid_;
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the uuid field is set.
   */
  @java.lang.Override
  public boolean hasUuid() {
    return uuid_ != null;
  }
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The uuid.
   */
  @java.lang.Override
  public opi_api.common.v1.Uuid getUuid() {
    return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
  }
  /**
   * <pre>
   * Globally unique identifier for the namespace
   * </pre>
   *
   * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
    return getUuid();
  }

  public static final int VOLUME_NAME_REF_FIELD_NUMBER = 6;
  private volatile java.lang.Object volumeNameRef_;
  /**
   * <pre>
   * The back/middle-end volume to back this namespace.
   * </pre>
   *
   * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The volumeNameRef.
   */
  @java.lang.Override
  public java.lang.String getVolumeNameRef() {
    java.lang.Object ref = volumeNameRef_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      volumeNameRef_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The back/middle-end volume to back this namespace.
   * </pre>
   *
   * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for volumeNameRef.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVolumeNameRefBytes() {
    java.lang.Object ref = volumeNameRef_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      volumeNameRef_ = b;
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
    if (hostNsid_ != 0) {
      output.writeInt32(2, hostNsid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nguid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nguid_);
    }
    if (eui64_ != 0L) {
      output.writeInt64(4, eui64_);
    }
    if (uuid_ != null) {
      output.writeMessage(5, getUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeNameRef_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, volumeNameRef_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hostNsid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, hostNsid_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nguid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nguid_);
    }
    if (eui64_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, eui64_);
    }
    if (uuid_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getUuid());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(volumeNameRef_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, volumeNameRef_);
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
    if (!(obj instanceof opi_api.storage.v1.NvmeNamespaceSpec)) {
      return super.equals(obj);
    }
    opi_api.storage.v1.NvmeNamespaceSpec other = (opi_api.storage.v1.NvmeNamespaceSpec) obj;

    if (getHostNsid()
        != other.getHostNsid()) return false;
    if (!getNguid()
        .equals(other.getNguid())) return false;
    if (getEui64()
        != other.getEui64()) return false;
    if (hasUuid() != other.hasUuid()) return false;
    if (hasUuid()) {
      if (!getUuid()
          .equals(other.getUuid())) return false;
    }
    if (!getVolumeNameRef()
        .equals(other.getVolumeNameRef())) return false;
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
    hash = (37 * hash) + HOST_NSID_FIELD_NUMBER;
    hash = (53 * hash) + getHostNsid();
    hash = (37 * hash) + NGUID_FIELD_NUMBER;
    hash = (53 * hash) + getNguid().hashCode();
    hash = (37 * hash) + EUI64_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEui64());
    if (hasUuid()) {
      hash = (37 * hash) + UUID_FIELD_NUMBER;
      hash = (53 * hash) + getUuid().hashCode();
    }
    hash = (37 * hash) + VOLUME_NAME_REF_FIELD_NUMBER;
    hash = (53 * hash) + getVolumeNameRef().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.storage.v1.NvmeNamespaceSpec parseFrom(
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
  public static Builder newBuilder(opi_api.storage.v1.NvmeNamespaceSpec prototype) {
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
   * <pre>
   * Represents Nvme Namespace configuration
   * </pre>
   *
   * Protobuf type {@code opi_api.storage.v1.NvmeNamespaceSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.storage.v1.NvmeNamespaceSpec)
      opi_api.storage.v1.NvmeNamespaceSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_NvmeNamespaceSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_NvmeNamespaceSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.storage.v1.NvmeNamespaceSpec.class, opi_api.storage.v1.NvmeNamespaceSpec.Builder.class);
    }

    // Construct using opi_api.storage.v1.NvmeNamespaceSpec.newBuilder()
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
      hostNsid_ = 0;

      nguid_ = "";

      eui64_ = 0L;

      if (uuidBuilder_ == null) {
        uuid_ = null;
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }
      volumeNameRef_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.storage.v1.FrontendNvmeProto.internal_static_opi_api_storage_v1_NvmeNamespaceSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeNamespaceSpec getDefaultInstanceForType() {
      return opi_api.storage.v1.NvmeNamespaceSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeNamespaceSpec build() {
      opi_api.storage.v1.NvmeNamespaceSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.storage.v1.NvmeNamespaceSpec buildPartial() {
      opi_api.storage.v1.NvmeNamespaceSpec result = new opi_api.storage.v1.NvmeNamespaceSpec(this);
      result.hostNsid_ = hostNsid_;
      result.nguid_ = nguid_;
      result.eui64_ = eui64_;
      if (uuidBuilder_ == null) {
        result.uuid_ = uuid_;
      } else {
        result.uuid_ = uuidBuilder_.build();
      }
      result.volumeNameRef_ = volumeNameRef_;
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
      if (other instanceof opi_api.storage.v1.NvmeNamespaceSpec) {
        return mergeFrom((opi_api.storage.v1.NvmeNamespaceSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.storage.v1.NvmeNamespaceSpec other) {
      if (other == opi_api.storage.v1.NvmeNamespaceSpec.getDefaultInstance()) return this;
      if (other.getHostNsid() != 0) {
        setHostNsid(other.getHostNsid());
      }
      if (!other.getNguid().isEmpty()) {
        nguid_ = other.nguid_;
        onChanged();
      }
      if (other.getEui64() != 0L) {
        setEui64(other.getEui64());
      }
      if (other.hasUuid()) {
        mergeUuid(other.getUuid());
      }
      if (!other.getVolumeNameRef().isEmpty()) {
        volumeNameRef_ = other.volumeNameRef_;
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
      opi_api.storage.v1.NvmeNamespaceSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.storage.v1.NvmeNamespaceSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hostNsid_ ;
    /**
     * <pre>
     * NSID presented by the Nvme controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The hostNsid.
     */
    @java.lang.Override
    public int getHostNsid() {
      return hostNsid_;
    }
    /**
     * <pre>
     * NSID presented by the Nvme controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The hostNsid to set.
     * @return This builder for chaining.
     */
    public Builder setHostNsid(int value) {
      
      hostNsid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * NSID presented by the Nvme controller.
     * If not provided, then the controller will assign an unused NSID
     * within the max namespace range - auto assigned nsid may not work
     * for live migration
     * </pre>
     *
     * <code>int32 host_nsid = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearHostNsid() {
      
      hostNsid_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object nguid_ = "";
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The nguid.
     */
    public java.lang.String getNguid() {
      java.lang.Object ref = nguid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nguid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for nguid.
     */
    public com.google.protobuf.ByteString
        getNguidBytes() {
      java.lang.Object ref = nguid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nguid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The nguid to set.
     * @return This builder for chaining.
     */
    public Builder setNguid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nguid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearNguid() {
      
      nguid_ = getDefaultInstance().getNguid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>string nguid = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for nguid to set.
     * @return This builder for chaining.
     */
    public Builder setNguidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nguid_ = value;
      onChanged();
      return this;
    }

    private long eui64_ ;
    /**
     * <pre>
     * 64bit Extended unique identifier for the namespace
     * mandatory if guid is not specified
     * </pre>
     *
     * <code>int64 eui64 = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The eui64.
     */
    @java.lang.Override
    public long getEui64() {
      return eui64_;
    }
    /**
     * <pre>
     * 64bit Extended unique identifier for the namespace
     * mandatory if guid is not specified
     * </pre>
     *
     * <code>int64 eui64 = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The eui64 to set.
     * @return This builder for chaining.
     */
    public Builder setEui64(long value) {
      
      eui64_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 64bit Extended unique identifier for the namespace
     * mandatory if guid is not specified
     * </pre>
     *
     * <code>int64 eui64 = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearEui64() {
      
      eui64_ = 0L;
      onChanged();
      return this;
    }

    private opi_api.common.v1.Uuid uuid_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> uuidBuilder_;
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the uuid field is set.
     */
    public boolean hasUuid() {
      return uuidBuilder_ != null || uuid_ != null;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The uuid.
     */
    public opi_api.common.v1.Uuid getUuid() {
      if (uuidBuilder_ == null) {
        return uuid_ == null ? opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      } else {
        return uuidBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uuid_ = value;
        onChanged();
      } else {
        uuidBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setUuid(
        opi_api.common.v1.Uuid.Builder builderForValue) {
      if (uuidBuilder_ == null) {
        uuid_ = builderForValue.build();
        onChanged();
      } else {
        uuidBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeUuid(opi_api.common.v1.Uuid value) {
      if (uuidBuilder_ == null) {
        if (uuid_ != null) {
          uuid_ =
            opi_api.common.v1.Uuid.newBuilder(uuid_).mergeFrom(value).buildPartial();
        } else {
          uuid_ = value;
        }
        onChanged();
      } else {
        uuidBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearUuid() {
      if (uuidBuilder_ == null) {
        uuid_ = null;
        onChanged();
      } else {
        uuid_ = null;
        uuidBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.common.v1.Uuid.Builder getUuidBuilder() {
      
      onChanged();
      return getUuidFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public opi_api.common.v1.UuidOrBuilder getUuidOrBuilder() {
      if (uuidBuilder_ != null) {
        return uuidBuilder_.getMessageOrBuilder();
      } else {
        return uuid_ == null ?
            opi_api.common.v1.Uuid.getDefaultInstance() : uuid_;
      }
    }
    /**
     * <pre>
     * Globally unique identifier for the namespace
     * </pre>
     *
     * <code>.opi_api.common.v1.Uuid uuid = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder> 
        getUuidFieldBuilder() {
      if (uuidBuilder_ == null) {
        uuidBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.Uuid, opi_api.common.v1.Uuid.Builder, opi_api.common.v1.UuidOrBuilder>(
                getUuid(),
                getParentForChildren(),
                isClean());
        uuid_ = null;
      }
      return uuidBuilder_;
    }

    private java.lang.Object volumeNameRef_ = "";
    /**
     * <pre>
     * The back/middle-end volume to back this namespace.
     * </pre>
     *
     * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The volumeNameRef.
     */
    public java.lang.String getVolumeNameRef() {
      java.lang.Object ref = volumeNameRef_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        volumeNameRef_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this namespace.
     * </pre>
     *
     * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for volumeNameRef.
     */
    public com.google.protobuf.ByteString
        getVolumeNameRefBytes() {
      java.lang.Object ref = volumeNameRef_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        volumeNameRef_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The back/middle-end volume to back this namespace.
     * </pre>
     *
     * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The volumeNameRef to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeNameRef(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      volumeNameRef_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this namespace.
     * </pre>
     *
     * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVolumeNameRef() {
      
      volumeNameRef_ = getDefaultInstance().getVolumeNameRef();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The back/middle-end volume to back this namespace.
     * </pre>
     *
     * <code>string volume_name_ref = 6 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for volumeNameRef to set.
     * @return This builder for chaining.
     */
    public Builder setVolumeNameRefBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      volumeNameRef_ = value;
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


    // @@protoc_insertion_point(builder_scope:opi_api.storage.v1.NvmeNamespaceSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.storage.v1.NvmeNamespaceSpec)
  private static final opi_api.storage.v1.NvmeNamespaceSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.storage.v1.NvmeNamespaceSpec();
  }

  public static opi_api.storage.v1.NvmeNamespaceSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NvmeNamespaceSpec>
      PARSER = new com.google.protobuf.AbstractParser<NvmeNamespaceSpec>() {
    @java.lang.Override
    public NvmeNamespaceSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NvmeNamespaceSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NvmeNamespaceSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NvmeNamespaceSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.storage.v1.NvmeNamespaceSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

