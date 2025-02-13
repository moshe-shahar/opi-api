// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * VPCPeerSpec captures configuration for a VPC peering relation
 * Given two vpcs, only one vpc peering objects needs to be created as
 * the vpc peering is commutative relation
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.VPCPeerSpec}
 */
public final class VPCPeerSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
    VPCPeerSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VPCPeerSpec.newBuilder() to construct.
  private VPCPeerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VPCPeerSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VPCPeerSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VPCPeerSpec(
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
            if (id_ != null) {
              subBuilder = id_.toBuilder();
            }
            id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(id_);
              id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (vpc1Id_ != null) {
              subBuilder = vpc1Id_.toBuilder();
            }
            vpc1Id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vpc1Id_);
              vpc1Id_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            opi_api.common.v1.ObjectKey.Builder subBuilder = null;
            if (vpc2Id_ != null) {
              subBuilder = vpc2Id_.toBuilder();
            }
            vpc2Id_ = input.readMessage(opi_api.common.v1.ObjectKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(vpc2Id_);
              vpc2Id_ = subBuilder.buildPartial();
            }

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
    return opi_api.network.cloud.v1alpha1.VpcProto.internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.VpcProto.internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.VPCPeerSpec.class, opi_api.network.cloud.v1alpha1.VPCPeerSpec.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private opi_api.common.v1.ObjectKey id_;
  /**
   * <pre>
   * unique id/key idenitifying this VPC peering relation
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return Whether the id field is set.
   */
  @java.lang.Override
  public boolean hasId() {
    return id_ != null;
  }
  /**
   * <pre>
   * unique id/key idenitifying this VPC peering relation
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getId() {
    return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
  }
  /**
   * <pre>
   * unique id/key idenitifying this VPC peering relation
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
    return getId();
  }

  public static final int VPC1_ID_FIELD_NUMBER = 2;
  private opi_api.common.v1.ObjectKey vpc1Id_;
  /**
   * <pre>
   * unique key/identifier of VPC1
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
   * @return Whether the vpc1Id field is set.
   */
  @java.lang.Override
  public boolean hasVpc1Id() {
    return vpc1Id_ != null;
  }
  /**
   * <pre>
   * unique key/identifier of VPC1
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
   * @return The vpc1Id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVpc1Id() {
    return vpc1Id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc1Id_;
  }
  /**
   * <pre>
   * unique key/identifier of VPC1
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVpc1IdOrBuilder() {
    return getVpc1Id();
  }

  public static final int VPC2_ID_FIELD_NUMBER = 3;
  private opi_api.common.v1.ObjectKey vpc2Id_;
  /**
   * <pre>
   * unique key/identifier of VPC2
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
   * @return Whether the vpc2Id field is set.
   */
  @java.lang.Override
  public boolean hasVpc2Id() {
    return vpc2Id_ != null;
  }
  /**
   * <pre>
   * unique key/identifier of VPC2
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
   * @return The vpc2Id.
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKey getVpc2Id() {
    return vpc2Id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc2Id_;
  }
  /**
   * <pre>
   * unique key/identifier of VPC2
   * </pre>
   *
   * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
   */
  @java.lang.Override
  public opi_api.common.v1.ObjectKeyOrBuilder getVpc2IdOrBuilder() {
    return getVpc2Id();
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
    if (id_ != null) {
      output.writeMessage(1, getId());
    }
    if (vpc1Id_ != null) {
      output.writeMessage(2, getVpc1Id());
    }
    if (vpc2Id_ != null) {
      output.writeMessage(3, getVpc2Id());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getId());
    }
    if (vpc1Id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getVpc1Id());
    }
    if (vpc2Id_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getVpc2Id());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.VPCPeerSpec)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.VPCPeerSpec other = (opi_api.network.cloud.v1alpha1.VPCPeerSpec) obj;

    if (hasId() != other.hasId()) return false;
    if (hasId()) {
      if (!getId()
          .equals(other.getId())) return false;
    }
    if (hasVpc1Id() != other.hasVpc1Id()) return false;
    if (hasVpc1Id()) {
      if (!getVpc1Id()
          .equals(other.getVpc1Id())) return false;
    }
    if (hasVpc2Id() != other.hasVpc2Id()) return false;
    if (hasVpc2Id()) {
      if (!getVpc2Id()
          .equals(other.getVpc2Id())) return false;
    }
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
    if (hasId()) {
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId().hashCode();
    }
    if (hasVpc1Id()) {
      hash = (37 * hash) + VPC1_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVpc1Id().hashCode();
    }
    if (hasVpc2Id()) {
      hash = (37 * hash) + VPC2_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVpc2Id().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.VPCPeerSpec prototype) {
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
   * VPCPeerSpec captures configuration for a VPC peering relation
   * Given two vpcs, only one vpc peering objects needs to be created as
   * the vpc peering is commutative relation
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.VPCPeerSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
      opi_api.network.cloud.v1alpha1.VPCPeerSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.VpcProto.internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.VpcProto.internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.VPCPeerSpec.class, opi_api.network.cloud.v1alpha1.VPCPeerSpec.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.VPCPeerSpec.newBuilder()
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
      if (idBuilder_ == null) {
        id_ = null;
      } else {
        id_ = null;
        idBuilder_ = null;
      }
      if (vpc1IdBuilder_ == null) {
        vpc1Id_ = null;
      } else {
        vpc1Id_ = null;
        vpc1IdBuilder_ = null;
      }
      if (vpc2IdBuilder_ == null) {
        vpc2Id_ = null;
      } else {
        vpc2Id_ = null;
        vpc2IdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.VpcProto.internal_static_opi_api_network_cloud_v1alpha1_VPCPeerSpec_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.VPCPeerSpec getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.VPCPeerSpec.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.VPCPeerSpec build() {
      opi_api.network.cloud.v1alpha1.VPCPeerSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.VPCPeerSpec buildPartial() {
      opi_api.network.cloud.v1alpha1.VPCPeerSpec result = new opi_api.network.cloud.v1alpha1.VPCPeerSpec(this);
      if (idBuilder_ == null) {
        result.id_ = id_;
      } else {
        result.id_ = idBuilder_.build();
      }
      if (vpc1IdBuilder_ == null) {
        result.vpc1Id_ = vpc1Id_;
      } else {
        result.vpc1Id_ = vpc1IdBuilder_.build();
      }
      if (vpc2IdBuilder_ == null) {
        result.vpc2Id_ = vpc2Id_;
      } else {
        result.vpc2Id_ = vpc2IdBuilder_.build();
      }
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
      if (other instanceof opi_api.network.cloud.v1alpha1.VPCPeerSpec) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.VPCPeerSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.VPCPeerSpec other) {
      if (other == opi_api.network.cloud.v1alpha1.VPCPeerSpec.getDefaultInstance()) return this;
      if (other.hasId()) {
        mergeId(other.getId());
      }
      if (other.hasVpc1Id()) {
        mergeVpc1Id(other.getVpc1Id());
      }
      if (other.hasVpc2Id()) {
        mergeVpc2Id(other.getVpc2Id());
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
      opi_api.network.cloud.v1alpha1.VPCPeerSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.VPCPeerSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.common.v1.ObjectKey id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> idBuilder_;
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return Whether the id field is set.
     */
    public boolean hasId() {
      return idBuilder_ != null || id_ != null;
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     * @return The id.
     */
    public opi_api.common.v1.ObjectKey getId() {
      if (idBuilder_ == null) {
        return id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      } else {
        return idBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        id_ = value;
        onChanged();
      } else {
        idBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder setId(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (idBuilder_ == null) {
        id_ = builderForValue.build();
        onChanged();
      } else {
        idBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder mergeId(opi_api.common.v1.ObjectKey value) {
      if (idBuilder_ == null) {
        if (id_ != null) {
          id_ =
            opi_api.common.v1.ObjectKey.newBuilder(id_).mergeFrom(value).buildPartial();
        } else {
          id_ = value;
        }
        onChanged();
      } else {
        idBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public Builder clearId() {
      if (idBuilder_ == null) {
        id_ = null;
        onChanged();
      } else {
        id_ = null;
        idBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getIdBuilder() {
      
      onChanged();
      return getIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getIdOrBuilder() {
      if (idBuilder_ != null) {
        return idBuilder_.getMessageOrBuilder();
      } else {
        return id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : id_;
      }
    }
    /**
     * <pre>
     * unique id/key idenitifying this VPC peering relation
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getIdFieldBuilder() {
      if (idBuilder_ == null) {
        idBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getId(),
                getParentForChildren(),
                isClean());
        id_ = null;
      }
      return idBuilder_;
    }

    private opi_api.common.v1.ObjectKey vpc1Id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> vpc1IdBuilder_;
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     * @return Whether the vpc1Id field is set.
     */
    public boolean hasVpc1Id() {
      return vpc1IdBuilder_ != null || vpc1Id_ != null;
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     * @return The vpc1Id.
     */
    public opi_api.common.v1.ObjectKey getVpc1Id() {
      if (vpc1IdBuilder_ == null) {
        return vpc1Id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc1Id_;
      } else {
        return vpc1IdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public Builder setVpc1Id(opi_api.common.v1.ObjectKey value) {
      if (vpc1IdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vpc1Id_ = value;
        onChanged();
      } else {
        vpc1IdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public Builder setVpc1Id(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (vpc1IdBuilder_ == null) {
        vpc1Id_ = builderForValue.build();
        onChanged();
      } else {
        vpc1IdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public Builder mergeVpc1Id(opi_api.common.v1.ObjectKey value) {
      if (vpc1IdBuilder_ == null) {
        if (vpc1Id_ != null) {
          vpc1Id_ =
            opi_api.common.v1.ObjectKey.newBuilder(vpc1Id_).mergeFrom(value).buildPartial();
        } else {
          vpc1Id_ = value;
        }
        onChanged();
      } else {
        vpc1IdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public Builder clearVpc1Id() {
      if (vpc1IdBuilder_ == null) {
        vpc1Id_ = null;
        onChanged();
      } else {
        vpc1Id_ = null;
        vpc1IdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVpc1IdBuilder() {
      
      onChanged();
      return getVpc1IdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getVpc1IdOrBuilder() {
      if (vpc1IdBuilder_ != null) {
        return vpc1IdBuilder_.getMessageOrBuilder();
      } else {
        return vpc1Id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc1Id_;
      }
    }
    /**
     * <pre>
     * unique key/identifier of VPC1
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc1_id = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getVpc1IdFieldBuilder() {
      if (vpc1IdBuilder_ == null) {
        vpc1IdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getVpc1Id(),
                getParentForChildren(),
                isClean());
        vpc1Id_ = null;
      }
      return vpc1IdBuilder_;
    }

    private opi_api.common.v1.ObjectKey vpc2Id_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> vpc2IdBuilder_;
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     * @return Whether the vpc2Id field is set.
     */
    public boolean hasVpc2Id() {
      return vpc2IdBuilder_ != null || vpc2Id_ != null;
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     * @return The vpc2Id.
     */
    public opi_api.common.v1.ObjectKey getVpc2Id() {
      if (vpc2IdBuilder_ == null) {
        return vpc2Id_ == null ? opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc2Id_;
      } else {
        return vpc2IdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public Builder setVpc2Id(opi_api.common.v1.ObjectKey value) {
      if (vpc2IdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        vpc2Id_ = value;
        onChanged();
      } else {
        vpc2IdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public Builder setVpc2Id(
        opi_api.common.v1.ObjectKey.Builder builderForValue) {
      if (vpc2IdBuilder_ == null) {
        vpc2Id_ = builderForValue.build();
        onChanged();
      } else {
        vpc2IdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public Builder mergeVpc2Id(opi_api.common.v1.ObjectKey value) {
      if (vpc2IdBuilder_ == null) {
        if (vpc2Id_ != null) {
          vpc2Id_ =
            opi_api.common.v1.ObjectKey.newBuilder(vpc2Id_).mergeFrom(value).buildPartial();
        } else {
          vpc2Id_ = value;
        }
        onChanged();
      } else {
        vpc2IdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public Builder clearVpc2Id() {
      if (vpc2IdBuilder_ == null) {
        vpc2Id_ = null;
        onChanged();
      } else {
        vpc2Id_ = null;
        vpc2IdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public opi_api.common.v1.ObjectKey.Builder getVpc2IdBuilder() {
      
      onChanged();
      return getVpc2IdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    public opi_api.common.v1.ObjectKeyOrBuilder getVpc2IdOrBuilder() {
      if (vpc2IdBuilder_ != null) {
        return vpc2IdBuilder_.getMessageOrBuilder();
      } else {
        return vpc2Id_ == null ?
            opi_api.common.v1.ObjectKey.getDefaultInstance() : vpc2Id_;
      }
    }
    /**
     * <pre>
     * unique key/identifier of VPC2
     * </pre>
     *
     * <code>.opi_api.common.v1.ObjectKey vpc2_id = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder> 
        getVpc2IdFieldBuilder() {
      if (vpc2IdBuilder_ == null) {
        vpc2IdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.common.v1.ObjectKey, opi_api.common.v1.ObjectKey.Builder, opi_api.common.v1.ObjectKeyOrBuilder>(
                getVpc2Id(),
                getParentForChildren(),
                isClean());
        vpc2Id_ = null;
      }
      return vpc2IdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.VPCPeerSpec)
  private static final opi_api.network.cloud.v1alpha1.VPCPeerSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.VPCPeerSpec();
  }

  public static opi_api.network.cloud.v1alpha1.VPCPeerSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VPCPeerSpec>
      PARSER = new com.google.protobuf.AbstractParser<VPCPeerSpec>() {
    @java.lang.Override
    public VPCPeerSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VPCPeerSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VPCPeerSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VPCPeerSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.VPCPeerSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

