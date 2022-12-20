// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory.proto

package opi_api.inventory.v1;

public interface InventoryGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opi_api.inventory.v1.InventoryGetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   * @return Whether the bios field is set.
   */
  boolean hasBios();
  /**
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   * @return The bios.
   */
  opi_api.inventory.v1.BIOSInfo getBios();
  /**
   * <code>.opi_api.inventory.v1.BIOSInfo bios = 1;</code>
   */
  opi_api.inventory.v1.BIOSInfoOrBuilder getBiosOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   * @return The system.
   */
  opi_api.inventory.v1.SystemInfo getSystem();
  /**
   * <code>.opi_api.inventory.v1.SystemInfo system = 2;</code>
   */
  opi_api.inventory.v1.SystemInfoOrBuilder getSystemOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   * @return Whether the baseboard field is set.
   */
  boolean hasBaseboard();
  /**
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   * @return The baseboard.
   */
  opi_api.inventory.v1.BaseboardInfo getBaseboard();
  /**
   * <code>.opi_api.inventory.v1.BaseboardInfo baseboard = 3;</code>
   */
  opi_api.inventory.v1.BaseboardInfoOrBuilder getBaseboardOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   * @return Whether the chassis field is set.
   */
  boolean hasChassis();
  /**
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   * @return The chassis.
   */
  opi_api.inventory.v1.ChassisInfo getChassis();
  /**
   * <code>.opi_api.inventory.v1.ChassisInfo chassis = 4;</code>
   */
  opi_api.inventory.v1.ChassisInfoOrBuilder getChassisOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   * @return Whether the processor field is set.
   */
  boolean hasProcessor();
  /**
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   * @return The processor.
   */
  opi_api.inventory.v1.CPUInfo getProcessor();
  /**
   * <code>.opi_api.inventory.v1.CPUInfo processor = 5;</code>
   */
  opi_api.inventory.v1.CPUInfoOrBuilder getProcessorOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   * @return The memory.
   */
  opi_api.inventory.v1.MemoryInfo getMemory();
  /**
   * <code>.opi_api.inventory.v1.MemoryInfo memory = 6;</code>
   */
  opi_api.inventory.v1.MemoryInfoOrBuilder getMemoryOrBuilder();

  /**
   * <code>.opi_api.inventory.v1.DeviceInfo devinfo = 7;</code>
   * @return Whether the devinfo field is set.
   */
  boolean hasDevinfo();
  /**
   * <code>.opi_api.inventory.v1.DeviceInfo devinfo = 7;</code>
   * @return The devinfo.
   */
  opi_api.inventory.v1.DeviceInfo getDevinfo();
  /**
   * <code>.opi_api.inventory.v1.DeviceInfo devinfo = 7;</code>
   */
  opi_api.inventory.v1.DeviceInfoOrBuilder getDevinfoOrBuilder();
}
