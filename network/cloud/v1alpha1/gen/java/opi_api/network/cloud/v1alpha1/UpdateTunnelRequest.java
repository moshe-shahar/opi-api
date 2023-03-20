// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cloudrpc.proto

package opi_api.network.cloud.v1alpha1;

/**
 * <pre>
 * Update Tunnel request
 * </pre>
 *
 * Protobuf type {@code opi_api.network.cloud.v1alpha1.UpdateTunnelRequest}
 */
public final class UpdateTunnelRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)
    UpdateTunnelRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateTunnelRequest.newBuilder() to construct.
  private UpdateTunnelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateTunnelRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateTunnelRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateTunnelRequest(
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
            opi_api.network.cloud.v1alpha1.Tunnel.Builder subBuilder = null;
            if (tunnel_ != null) {
              subBuilder = tunnel_.toBuilder();
            }
            tunnel_ = input.readMessage(opi_api.network.cloud.v1alpha1.Tunnel.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tunnel_);
              tunnel_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
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
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateTunnelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateTunnelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.class, opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.Builder.class);
  }

  public static final int TUNNEL_FIELD_NUMBER = 1;
  private opi_api.network.cloud.v1alpha1.Tunnel tunnel_;
  /**
   * <pre>
   * updated tunnel info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   * @return Whether the tunnel field is set.
   */
  @java.lang.Override
  public boolean hasTunnel() {
    return tunnel_ != null;
  }
  /**
   * <pre>
   * updated tunnel info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   * @return The tunnel.
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.Tunnel getTunnel() {
    return tunnel_ == null ? opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance() : tunnel_;
  }
  /**
   * <pre>
   * updated tunnel info
   * </pre>
   *
   * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.TunnelOrBuilder getTunnelOrBuilder() {
    return getTunnel();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * list of fields to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (tunnel_ != null) {
      output.writeMessage(1, getTunnel());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tunnel_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTunnel());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)) {
      return super.equals(obj);
    }
    opi_api.network.cloud.v1alpha1.UpdateTunnelRequest other = (opi_api.network.cloud.v1alpha1.UpdateTunnelRequest) obj;

    if (hasTunnel() != other.hasTunnel()) return false;
    if (hasTunnel()) {
      if (!getTunnel()
          .equals(other.getTunnel())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasTunnel()) {
      hash = (37 * hash) + TUNNEL_FIELD_NUMBER;
      hash = (53 * hash) + getTunnel().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parseFrom(
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
  public static Builder newBuilder(opi_api.network.cloud.v1alpha1.UpdateTunnelRequest prototype) {
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
   * Update Tunnel request
   * </pre>
   *
   * Protobuf type {@code opi_api.network.cloud.v1alpha1.UpdateTunnelRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)
      opi_api.network.cloud.v1alpha1.UpdateTunnelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateTunnelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateTunnelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.class, opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.Builder.class);
    }

    // Construct using opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.newBuilder()
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
      if (tunnelBuilder_ == null) {
        tunnel_ = null;
      } else {
        tunnel_ = null;
        tunnelBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.cloud.v1alpha1.CloudRPC.internal_static_opi_api_network_cloud_v1alpha1_UpdateTunnelRequest_descriptor;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateTunnelRequest getDefaultInstanceForType() {
      return opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateTunnelRequest build() {
      opi_api.network.cloud.v1alpha1.UpdateTunnelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.cloud.v1alpha1.UpdateTunnelRequest buildPartial() {
      opi_api.network.cloud.v1alpha1.UpdateTunnelRequest result = new opi_api.network.cloud.v1alpha1.UpdateTunnelRequest(this);
      if (tunnelBuilder_ == null) {
        result.tunnel_ = tunnel_;
      } else {
        result.tunnel_ = tunnelBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof opi_api.network.cloud.v1alpha1.UpdateTunnelRequest) {
        return mergeFrom((opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.cloud.v1alpha1.UpdateTunnelRequest other) {
      if (other == opi_api.network.cloud.v1alpha1.UpdateTunnelRequest.getDefaultInstance()) return this;
      if (other.hasTunnel()) {
        mergeTunnel(other.getTunnel());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      opi_api.network.cloud.v1alpha1.UpdateTunnelRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.cloud.v1alpha1.UpdateTunnelRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private opi_api.network.cloud.v1alpha1.Tunnel tunnel_;
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder> tunnelBuilder_;
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     * @return Whether the tunnel field is set.
     */
    public boolean hasTunnel() {
      return tunnelBuilder_ != null || tunnel_ != null;
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     * @return The tunnel.
     */
    public opi_api.network.cloud.v1alpha1.Tunnel getTunnel() {
      if (tunnelBuilder_ == null) {
        return tunnel_ == null ? opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance() : tunnel_;
      } else {
        return tunnelBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder setTunnel(opi_api.network.cloud.v1alpha1.Tunnel value) {
      if (tunnelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tunnel_ = value;
        onChanged();
      } else {
        tunnelBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder setTunnel(
        opi_api.network.cloud.v1alpha1.Tunnel.Builder builderForValue) {
      if (tunnelBuilder_ == null) {
        tunnel_ = builderForValue.build();
        onChanged();
      } else {
        tunnelBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder mergeTunnel(opi_api.network.cloud.v1alpha1.Tunnel value) {
      if (tunnelBuilder_ == null) {
        if (tunnel_ != null) {
          tunnel_ =
            opi_api.network.cloud.v1alpha1.Tunnel.newBuilder(tunnel_).mergeFrom(value).buildPartial();
        } else {
          tunnel_ = value;
        }
        onChanged();
      } else {
        tunnelBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public Builder clearTunnel() {
      if (tunnelBuilder_ == null) {
        tunnel_ = null;
        onChanged();
      } else {
        tunnel_ = null;
        tunnelBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.Tunnel.Builder getTunnelBuilder() {
      
      onChanged();
      return getTunnelFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    public opi_api.network.cloud.v1alpha1.TunnelOrBuilder getTunnelOrBuilder() {
      if (tunnelBuilder_ != null) {
        return tunnelBuilder_.getMessageOrBuilder();
      } else {
        return tunnel_ == null ?
            opi_api.network.cloud.v1alpha1.Tunnel.getDefaultInstance() : tunnel_;
      }
    }
    /**
     * <pre>
     * updated tunnel info
     * </pre>
     *
     * <code>.opi_api.network.cloud.v1alpha1.Tunnel tunnel = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder> 
        getTunnelFieldBuilder() {
      if (tunnelBuilder_ == null) {
        tunnelBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            opi_api.network.cloud.v1alpha1.Tunnel, opi_api.network.cloud.v1alpha1.Tunnel.Builder, opi_api.network.cloud.v1alpha1.TunnelOrBuilder>(
                getTunnel(),
                getParentForChildren(),
                isClean());
        tunnel_ = null;
      }
      return tunnelBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * list of fields to update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.cloud.v1alpha1.UpdateTunnelRequest)
  private static final opi_api.network.cloud.v1alpha1.UpdateTunnelRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.cloud.v1alpha1.UpdateTunnelRequest();
  }

  public static opi_api.network.cloud.v1alpha1.UpdateTunnelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTunnelRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateTunnelRequest>() {
    @java.lang.Override
    public UpdateTunnelRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateTunnelRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateTunnelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTunnelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.cloud.v1alpha1.UpdateTunnelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
