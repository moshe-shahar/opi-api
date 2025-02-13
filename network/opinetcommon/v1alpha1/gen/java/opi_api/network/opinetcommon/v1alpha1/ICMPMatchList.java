// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: networktypes.proto

package opi_api.network.opinetcommon.v1alpha1;

/**
 * <pre>
 * ICMP type/code match condition list
 * </pre>
 *
 * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.ICMPMatchList}
 */
public final class ICMPMatchList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)
    ICMPMatchListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ICMPMatchList.newBuilder() to construct.
  private ICMPMatchList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ICMPMatchList() {
    icmpMatchList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ICMPMatchList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ICMPMatchList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              icmpMatchList_ = new java.util.ArrayList<opi_api.network.opinetcommon.v1alpha1.ICMPMatch>();
              mutable_bitField0_ |= 0x00000001;
            }
            icmpMatchList_.add(
                input.readMessage(opi_api.network.opinetcommon.v1alpha1.ICMPMatch.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        icmpMatchList_ = java.util.Collections.unmodifiableList(icmpMatchList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_ICMPMatchList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_ICMPMatchList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.class, opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.Builder.class);
  }

  public static final int ICMP_MATCH_LIST_FIELD_NUMBER = 1;
  private java.util.List<opi_api.network.opinetcommon.v1alpha1.ICMPMatch> icmpMatchList_;
  /**
   * <pre>
   * ICMP type/code list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<opi_api.network.opinetcommon.v1alpha1.ICMPMatch> getIcmpMatchListList() {
    return icmpMatchList_;
  }
  /**
   * <pre>
   * ICMP type/code list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder> 
      getIcmpMatchListOrBuilderList() {
    return icmpMatchList_;
  }
  /**
   * <pre>
   * ICMP type/code list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
   */
  @java.lang.Override
  public int getIcmpMatchListCount() {
    return icmpMatchList_.size();
  }
  /**
   * <pre>
   * ICMP type/code list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.ICMPMatch getIcmpMatchList(int index) {
    return icmpMatchList_.get(index);
  }
  /**
   * <pre>
   * ICMP type/code list
   * </pre>
   *
   * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
   */
  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder getIcmpMatchListOrBuilder(
      int index) {
    return icmpMatchList_.get(index);
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
    for (int i = 0; i < icmpMatchList_.size(); i++) {
      output.writeMessage(1, icmpMatchList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < icmpMatchList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, icmpMatchList_.get(i));
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
    if (!(obj instanceof opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)) {
      return super.equals(obj);
    }
    opi_api.network.opinetcommon.v1alpha1.ICMPMatchList other = (opi_api.network.opinetcommon.v1alpha1.ICMPMatchList) obj;

    if (!getIcmpMatchListList()
        .equals(other.getIcmpMatchListList())) return false;
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
    if (getIcmpMatchListCount() > 0) {
      hash = (37 * hash) + ICMP_MATCH_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getIcmpMatchListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parseFrom(
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
  public static Builder newBuilder(opi_api.network.opinetcommon.v1alpha1.ICMPMatchList prototype) {
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
   * ICMP type/code match condition list
   * </pre>
   *
   * Protobuf type {@code opi_api.network.opinetcommon.v1alpha1.ICMPMatchList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)
      opi_api.network.opinetcommon.v1alpha1.ICMPMatchListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_ICMPMatchList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_ICMPMatchList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.class, opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.Builder.class);
    }

    // Construct using opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.newBuilder()
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
        getIcmpMatchListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (icmpMatchListBuilder_ == null) {
        icmpMatchList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        icmpMatchListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return opi_api.network.opinetcommon.v1alpha1.NetworkTypesProto.internal_static_opi_api_network_opinetcommon_v1alpha1_ICMPMatchList_descriptor;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatchList getDefaultInstanceForType() {
      return opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.getDefaultInstance();
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatchList build() {
      opi_api.network.opinetcommon.v1alpha1.ICMPMatchList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatchList buildPartial() {
      opi_api.network.opinetcommon.v1alpha1.ICMPMatchList result = new opi_api.network.opinetcommon.v1alpha1.ICMPMatchList(this);
      int from_bitField0_ = bitField0_;
      if (icmpMatchListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          icmpMatchList_ = java.util.Collections.unmodifiableList(icmpMatchList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.icmpMatchList_ = icmpMatchList_;
      } else {
        result.icmpMatchList_ = icmpMatchListBuilder_.build();
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
      if (other instanceof opi_api.network.opinetcommon.v1alpha1.ICMPMatchList) {
        return mergeFrom((opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(opi_api.network.opinetcommon.v1alpha1.ICMPMatchList other) {
      if (other == opi_api.network.opinetcommon.v1alpha1.ICMPMatchList.getDefaultInstance()) return this;
      if (icmpMatchListBuilder_ == null) {
        if (!other.icmpMatchList_.isEmpty()) {
          if (icmpMatchList_.isEmpty()) {
            icmpMatchList_ = other.icmpMatchList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIcmpMatchListIsMutable();
            icmpMatchList_.addAll(other.icmpMatchList_);
          }
          onChanged();
        }
      } else {
        if (!other.icmpMatchList_.isEmpty()) {
          if (icmpMatchListBuilder_.isEmpty()) {
            icmpMatchListBuilder_.dispose();
            icmpMatchListBuilder_ = null;
            icmpMatchList_ = other.icmpMatchList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            icmpMatchListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getIcmpMatchListFieldBuilder() : null;
          } else {
            icmpMatchListBuilder_.addAllMessages(other.icmpMatchList_);
          }
        }
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
      opi_api.network.opinetcommon.v1alpha1.ICMPMatchList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (opi_api.network.opinetcommon.v1alpha1.ICMPMatchList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<opi_api.network.opinetcommon.v1alpha1.ICMPMatch> icmpMatchList_ =
      java.util.Collections.emptyList();
    private void ensureIcmpMatchListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        icmpMatchList_ = new java.util.ArrayList<opi_api.network.opinetcommon.v1alpha1.ICMPMatch>(icmpMatchList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.ICMPMatch, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder, opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder> icmpMatchListBuilder_;

    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public java.util.List<opi_api.network.opinetcommon.v1alpha1.ICMPMatch> getIcmpMatchListList() {
      if (icmpMatchListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(icmpMatchList_);
      } else {
        return icmpMatchListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public int getIcmpMatchListCount() {
      if (icmpMatchListBuilder_ == null) {
        return icmpMatchList_.size();
      } else {
        return icmpMatchListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatch getIcmpMatchList(int index) {
      if (icmpMatchListBuilder_ == null) {
        return icmpMatchList_.get(index);
      } else {
        return icmpMatchListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder setIcmpMatchList(
        int index, opi_api.network.opinetcommon.v1alpha1.ICMPMatch value) {
      if (icmpMatchListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.set(index, value);
        onChanged();
      } else {
        icmpMatchListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder setIcmpMatchList(
        int index, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder builderForValue) {
      if (icmpMatchListBuilder_ == null) {
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.set(index, builderForValue.build());
        onChanged();
      } else {
        icmpMatchListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder addIcmpMatchList(opi_api.network.opinetcommon.v1alpha1.ICMPMatch value) {
      if (icmpMatchListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.add(value);
        onChanged();
      } else {
        icmpMatchListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder addIcmpMatchList(
        int index, opi_api.network.opinetcommon.v1alpha1.ICMPMatch value) {
      if (icmpMatchListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.add(index, value);
        onChanged();
      } else {
        icmpMatchListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder addIcmpMatchList(
        opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder builderForValue) {
      if (icmpMatchListBuilder_ == null) {
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.add(builderForValue.build());
        onChanged();
      } else {
        icmpMatchListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder addIcmpMatchList(
        int index, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder builderForValue) {
      if (icmpMatchListBuilder_ == null) {
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.add(index, builderForValue.build());
        onChanged();
      } else {
        icmpMatchListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder addAllIcmpMatchList(
        java.lang.Iterable<? extends opi_api.network.opinetcommon.v1alpha1.ICMPMatch> values) {
      if (icmpMatchListBuilder_ == null) {
        ensureIcmpMatchListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, icmpMatchList_);
        onChanged();
      } else {
        icmpMatchListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder clearIcmpMatchList() {
      if (icmpMatchListBuilder_ == null) {
        icmpMatchList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        icmpMatchListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public Builder removeIcmpMatchList(int index) {
      if (icmpMatchListBuilder_ == null) {
        ensureIcmpMatchListIsMutable();
        icmpMatchList_.remove(index);
        onChanged();
      } else {
        icmpMatchListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder getIcmpMatchListBuilder(
        int index) {
      return getIcmpMatchListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder getIcmpMatchListOrBuilder(
        int index) {
      if (icmpMatchListBuilder_ == null) {
        return icmpMatchList_.get(index);  } else {
        return icmpMatchListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public java.util.List<? extends opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder> 
         getIcmpMatchListOrBuilderList() {
      if (icmpMatchListBuilder_ != null) {
        return icmpMatchListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(icmpMatchList_);
      }
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder addIcmpMatchListBuilder() {
      return getIcmpMatchListFieldBuilder().addBuilder(
          opi_api.network.opinetcommon.v1alpha1.ICMPMatch.getDefaultInstance());
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder addIcmpMatchListBuilder(
        int index) {
      return getIcmpMatchListFieldBuilder().addBuilder(
          index, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.getDefaultInstance());
    }
    /**
     * <pre>
     * ICMP type/code list
     * </pre>
     *
     * <code>repeated .opi_api.network.opinetcommon.v1alpha1.ICMPMatch icmp_match_list = 1;</code>
     */
    public java.util.List<opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder> 
         getIcmpMatchListBuilderList() {
      return getIcmpMatchListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        opi_api.network.opinetcommon.v1alpha1.ICMPMatch, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder, opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder> 
        getIcmpMatchListFieldBuilder() {
      if (icmpMatchListBuilder_ == null) {
        icmpMatchListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            opi_api.network.opinetcommon.v1alpha1.ICMPMatch, opi_api.network.opinetcommon.v1alpha1.ICMPMatch.Builder, opi_api.network.opinetcommon.v1alpha1.ICMPMatchOrBuilder>(
                icmpMatchList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        icmpMatchList_ = null;
      }
      return icmpMatchListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)
  }

  // @@protoc_insertion_point(class_scope:opi_api.network.opinetcommon.v1alpha1.ICMPMatchList)
  private static final opi_api.network.opinetcommon.v1alpha1.ICMPMatchList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new opi_api.network.opinetcommon.v1alpha1.ICMPMatchList();
  }

  public static opi_api.network.opinetcommon.v1alpha1.ICMPMatchList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ICMPMatchList>
      PARSER = new com.google.protobuf.AbstractParser<ICMPMatchList>() {
    @java.lang.Override
    public ICMPMatchList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ICMPMatchList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ICMPMatchList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ICMPMatchList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public opi_api.network.opinetcommon.v1alpha1.ICMPMatchList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

