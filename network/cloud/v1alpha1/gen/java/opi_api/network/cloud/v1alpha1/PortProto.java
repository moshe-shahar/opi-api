// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: port.proto

package opi_api.network.cloud.v1alpha1;

public final class PortProto {
  private PortProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_Port_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PortSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PortSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PortStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PortStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PortLinkStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PortXcvrStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PortXcvrStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkFSMRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_cloud_v1alpha1_PortLinkFSMRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nport.proto\022\036opi_api.network.cloud.v1al" +
      "pha1\032\020object_key.proto\032\037google/protobuf/" +
      "timestamp.proto\"z\n\004Port\0226\n\004spec\030\001 \001(\0132(." +
      "opi_api.network.cloud.v1alpha1.PortSpec\022" +
      ":\n\006status\030\002 \001(\0132*.opi_api.network.cloud." +
      "v1alpha1.PortStatus\"\311\004\n\010PortSpec\022(\n\002id\030\001" +
      " \001(\0132\034.opi_api.common.v1.ObjectKey\022\023\n\013po" +
      "rt_number\030\002 \001(\005\022C\n\013admin_state\030\003 \001(\0162..o" +
      "pi_api.network.cloud.v1alpha1.PortAdminS" +
      "tate\0226\n\004type\030\004 \001(\0162(.opi_api.network.clo" +
      "ud.v1alpha1.PortType\0228\n\005speed\030\005 \001(\0162).op" +
      "i_api.network.cloud.v1alpha1.PortSpeed\022=" +
      "\n\010fec_type\030\006 \001(\0162+.opi_api.network.cloud" +
      ".v1alpha1.PortFecType\022\026\n\016autoneg_enable\030" +
      "\007 \001(\010\022\030\n\020debounce_timeout\030\010 \001(\005\022\013\n\003mtu\030\t" +
      " \001(\005\022A\n\npause_type\030\n \001(\0162-.opi_api.netwo" +
      "rk.cloud.v1alpha1.PortPauseType\022\023\n\013tx_pa" +
      "use_en\030\013 \001(\010\022\023\n\013rx_pause_en\030\014 \001(\010\022G\n\rloo" +
      "pback_mode\030\r \001(\01620.opi_api.network.cloud" +
      ".v1alpha1.PortLoopBackMode\022\023\n\013lanes_coun" +
      "t\030\016 \001(\005\"\317\002\n\nPortStatus\022\020\n\010if_index\030\001 \001(\r" +
      "\022C\n\013link_status\030\002 \001(\0132..opi_api.network." +
      "cloud.v1alpha1.PortLinkStatus\022C\n\013xcvr_st" +
      "atus\030\003 \001(\0132..opi_api.network.cloud.v1alp" +
      "ha1.PortXcvrStatus\022>\n\tfsm_state\030\004 \001(\0162+." +
      "opi_api.network.cloud.v1alpha1.PortLinkF" +
      "SM\022\016\n\006mac_id\030\005 \001(\005\022\016\n\006mac_ch\030\006 \001(\005\022E\n\nfs" +
      "m_record\030\007 \003(\01321.opi_api.network.cloud.v" +
      "1alpha1.PortLinkFSMRecord\"\372\001\n\016PortLinkSt" +
      "atus\022A\n\noper_state\030\001 \001(\0162-.opi_api.netwo" +
      "rk.cloud.v1alpha1.PortOperState\022=\n\nport_" +
      "speed\030\002 \001(\0162).opi_api.network.cloud.v1al" +
      "pha1.PortSpeed\022\022\n\nautoneg_en\030\003 \001(\010\022\023\n\013la" +
      "nes_count\030\004 \001(\005\022=\n\010fec_type\030\005 \001(\0162+.opi_" +
      "api.network.cloud.v1alpha1.PortFecType\"\260" +
      "\003\n\016PortXcvrStatus\022\014\n\004port\030\001 \001(\005\022<\n\005state" +
      "\030\002 \001(\0162-.opi_api.network.cloud.v1alpha1." +
      "PortXcvrState\0228\n\003pid\030\003 \001(\0162+.opi_api.net" +
      "work.cloud.v1alpha1.PortXcvrPid\022=\n\nmedia" +
      "_type\030\004 \001(\0162).opi_api.network.cloud.v1al" +
      "pha1.MediaType\022\022\n\nxcvr_sprom\030\005 \001(\014\022\022\n\nve" +
      "ndorname\030\006 \001(\t\022\022\n\nvendor_oui\030\007 \001(\t\022\025\n\ren" +
      "coding_type\030\010 \001(\005\022\025\n\rserial_number\030\t \001(\t" +
      "\022\023\n\013part_number\030\n \001(\t\022\020\n\010revision\030\013 \001(\t\022" +
      "\023\n\013temperature\030\014 \001(\005\022\030\n\020warn_temperature" +
      "\030\r \001(\005\022\031\n\021alarm_temperature\030\016 \001(\005\"\225\001\n\021Po" +
      "rtLinkFSMRecord\022>\n\tfsm_state\030\001 \001(\0162+.opi" +
      "_api.network.cloud.v1alpha1.PortLinkFSM\022" +
      ".\n\nstate_time\030\002 \001(\0132\032.google.protobuf.Ti" +
      "mestamp\022\020\n\010duration\030\003 \001(\t*f\n\016PortAdminSt" +
      "ate\022 \n\034PORT_ADMIN_STATE_UNSPECIFIED\020\000\022\031\n" +
      "\025PORT_ADMIN_STATE_DOWN\020\001\022\027\n\023PORT_ADMIN_S" +
      "TATE_UP\020\002*\257\001\n\rPortXcvrState\022\037\n\033PORT_XCVR" +
      "_STATE_UNSPECIFIED\020\000\022\034\n\030PORT_XCVR_STATE_" +
      "INSERTED\020\001\022\033\n\027PORT_XCVR_STATE_PENDING\020\002\022" +
      "\036\n\032PORT_XCVR_STATE_SPROM_READ\020\003\022\"\n\036PORT_" +
      "XCVR_STATE_SPROM_READ_ERR\020\004*\370\010\n\013PortXcvr" +
      "Pid\022\035\n\031PORT_XCVR_PID_UNSPECIFIED\020\000\022\037\n\033PO" +
      "RT_XCVR_PID_QSFP_100G_CR4\020\001\022\"\n\036PORT_XCVR" +
      "_PID_QSFP_40GBASE_CR4\020\002\022\"\n\036PORT_XCVR_PID" +
      "_SFP_25GBASE_CR_S\020\003\022\"\n\036PORT_XCVR_PID_SFP" +
      "_25GBASE_CR_L\020\004\022\"\n\036PORT_XCVR_PID_SFP_25G" +
      "BASE_CR_N\020\005\022!\n\035PORT_XCVR_PID_QSFP_50G_CR" +
      "2_FC\020\006\022\036\n\032PORT_XCVR_PID_QSFP_50G_CR2\020\007\022\037" +
      "\n\033PORT_XCVR_PID_QSFP_200G_CR4\020\010\022\037\n\033PORT_" +
      "XCVR_PID_QSFP_100G_AOC\0202\022\037\n\033PORT_XCVR_PI" +
      "D_QSFP_100G_ACC\0203\022\037\n\033PORT_XCVR_PID_QSFP_" +
      "100G_SR4\0204\022\037\n\033PORT_XCVR_PID_QSFP_100G_LR" +
      "4\0205\022\037\n\033PORT_XCVR_PID_QSFP_100G_ER4\0206\022\"\n\036" +
      "PORT_XCVR_PID_QSFP_40GBASE_ER4\0207\022\"\n\036PORT" +
      "_XCVR_PID_QSFP_40GBASE_SR4\0208\022\"\n\036PORT_XCV" +
      "R_PID_QSFP_40GBASE_LR4\0209\022\"\n\036PORT_XCVR_PI" +
      "D_QSFP_40GBASE_AOC\020:\022 \n\034PORT_XCVR_PID_SF" +
      "P_25GBASE_SR\020;\022 \n\034PORT_XCVR_PID_SFP_25GB" +
      "ASE_LR\020<\022 \n\034PORT_XCVR_PID_SFP_25GBASE_ER" +
      "\020=\022!\n\035PORT_XCVR_PID_SFP_25GBASE_AOC\020>\022 \n" +
      "\034PORT_XCVR_PID_SFP_10GBASE_SR\020?\022 \n\034PORT_" +
      "XCVR_PID_SFP_10GBASE_LR\020@\022!\n\035PORT_XCVR_P" +
      "ID_SFP_10GBASE_LRM\020A\022 \n\034PORT_XCVR_PID_SF" +
      "P_10GBASE_ER\020B\022!\n\035PORT_XCVR_PID_SFP_10GB" +
      "ASE_AOC\020C\022 \n\034PORT_XCVR_PID_SFP_10GBASE_C" +
      "U\020D\022!\n\035PORT_XCVR_PID_QSFP_100G_CWDM4\020E\022 " +
      "\n\034PORT_XCVR_PID_QSFP_100G_PSM4\020F\022!\n\035PORT" +
      "_XCVR_PID_SFP_25GBASE_ACC\020G\022\037\n\033PORT_XCVR" +
      "_PID_SFP_10GBASE_T\020H\022 \n\034PORT_XCVR_PID_SF" +
      "P_1000BASE_T\020I*T\n\tMediaType\022\032\n\026MEDIA_TYP" +
      "E_UNSPECIFIED\020\000\022\025\n\021MEDIA_TYPE_COPPER\020\001\022\024" +
      "\n\020MEDIA_TYPE_FIBER\020\002*b\n\rPortOperState\022\037\n" +
      "\033PORT_OPER_STATE_UNSPECIFIED\020\000\022\026\n\022PORT_O" +
      "PER_STATE_UP\020\001\022\030\n\024PORT_OPER_STATE_DOWN\020\002" +
      "*c\n\rPortPauseType\022\037\n\033PORT_PAUSE_TYPE_UNS" +
      "PECIFIED\020\000\022\030\n\024PORT_PAUSE_TYPE_LINK\020\001\022\027\n\023" +
      "PORT_PAUSE_TYPE_PFC\020\002*\266\006\n\013PortLinkFSM\022\035\n" +
      "\031PORT_LINK_FSM_UNSPECIFIED\020\000\022\031\n\025PORT_LIN" +
      "K_FSM_ENABLED\020\001\022\030\n\024PORT_LINK_FSM_AN_CFG\020" +
      "\002\022\035\n\031PORT_LINK_FSM_AN_DISABLED\020\003\022\032\n\026PORT" +
      "_LINK_FSM_AN_START\020\004\022\"\n\036PORT_LINK_FSM_AN" +
      "_SIGNAL_DETECT\020\005\022\035\n\031PORT_LINK_FSM_AN_WAI" +
      "T_HCD\020\006\022\035\n\031PORT_LINK_FSM_AN_COMPLETE\020\007\022\034" +
      "\n\030PORT_LINK_FSM_SERDES_CFG\020\010\022!\n\035PORT_LIN" +
      "K_FSM_WAIT_SERDES_RDY\020\t\022\031\n\025PORT_LINK_FSM" +
      "_MAC_CFG\020\n\022\037\n\033PORT_LINK_FSM_SIGNAL_DETEC" +
      "T\020\013\022\037\n\033PORT_LINK_FSM_AN_DFE_TUNING\020\014\022\034\n\030" +
      "PORT_LINK_FSM_DFE_TUNING\020\r\022\036\n\032PORT_LINK_" +
      "FSM_DFE_DISABLED\020\016\022 \n\034PORT_LINK_FSM_DFE_" +
      "START_ICAL\020\017\022\037\n\033PORT_LINK_FSM_DFE_WAIT_I" +
      "CAL\020\020\022 \n\034PORT_LINK_FSM_DFE_START_PCAL\020\021\022" +
      "\037\n\033PORT_LINK_FSM_DFE_WAIT_PCAL\020\022\022%\n!PORT" +
      "_LINK_FSM_DFE_PCAL_CONTINUOUS\020\023\022)\n%PORT_" +
      "LINK_FSM_CLEAR_MAC_REMOTE_FAULTS\020\024\022\037\n\033PO" +
      "RT_LINK_FSM_WAIT_MAC_SYNC\020\025\022\'\n#PORT_LINK" +
      "_FSM_WAIT_MAC_FAULTS_CLEAR\020\026\022\"\n\036PORT_LIN" +
      "K_FSM_WAIT_PHY_LINK_UP\020\027\022\024\n\020PORT_LINK_FS" +
      "M_UP\020\030*q\n\020PortLoopBackMode\022#\n\037PORT_LOOP_" +
      "BACK_MODE_UNSPECIFIED\020\000\022\033\n\027PORT_LOOP_BAC" +
      "K_MODE_MAC\020\001\022\033\n\027PORT_LOOP_BACK_MODE_PHY\020" +
      "\002*X\n\013PortFecType\022\035\n\031PORT_FEC_TYPE_UNSPEC" +
      "IFIED\020\000\022\024\n\020PORT_FEC_TYPE_FC\020\001\022\024\n\020PORT_FE" +
      "C_TYPE_RS\020\002*P\n\010PortType\022\031\n\025PORT_TYPE_UNS" +
      "PECIFIED\020\000\022\021\n\rPORT_TYPE_ETH\020\001\022\026\n\022PORT_TY" +
      "PE_ETH_MGMT\020\002*\362\001\n\tPortSpeed\022\032\n\026PORT_SPEE" +
      "D_UNSPECIFIED\020\000\022\022\n\016PORT_SPEED_10M\020\001\022\023\n\017P" +
      "ORT_SPEED_100M\020\002\022\021\n\rPORT_SPEED_1G\020\003\022\022\n\016P" +
      "ORT_SPEED_10G\020\004\022\022\n\016PORT_SPEED_25G\020\005\022\022\n\016P" +
      "ORT_SPEED_40G\020\006\022\022\n\016PORT_SPEED_50G\020\007\022\023\n\017P" +
      "ORT_SPEED_100G\020\010\022\023\n\017PORT_SPEED_200G\020\t\022\023\n" +
      "\017PORT_SPEED_400G\020\nBj\n\036opi_api.network.cl" +
      "oud.v1alpha1B\tPortProtoP\001Z;github.com/op" +
      "iproject/opi-api/network/cloud/v1alpha1/" +
      "gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          opi_api.common.v1.ObjectKeyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_opi_api_network_cloud_v1alpha1_Port_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_cloud_v1alpha1_Port_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_Port_descriptor,
        new java.lang.String[] { "Spec", "Status", });
    internal_static_opi_api_network_cloud_v1alpha1_PortSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_cloud_v1alpha1_PortSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PortSpec_descriptor,
        new java.lang.String[] { "Id", "PortNumber", "AdminState", "Type", "Speed", "FecType", "AutonegEnable", "DebounceTimeout", "Mtu", "PauseType", "TxPauseEn", "RxPauseEn", "LoopbackMode", "LanesCount", });
    internal_static_opi_api_network_cloud_v1alpha1_PortStatus_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_cloud_v1alpha1_PortStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PortStatus_descriptor,
        new java.lang.String[] { "IfIndex", "LinkStatus", "XcvrStatus", "FsmState", "MacId", "MacCh", "FsmRecord", });
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkStatus_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PortLinkStatus_descriptor,
        new java.lang.String[] { "OperState", "PortSpeed", "AutonegEn", "LanesCount", "FecType", });
    internal_static_opi_api_network_cloud_v1alpha1_PortXcvrStatus_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_cloud_v1alpha1_PortXcvrStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PortXcvrStatus_descriptor,
        new java.lang.String[] { "Port", "State", "Pid", "MediaType", "XcvrSprom", "Vendorname", "VendorOui", "EncodingType", "SerialNumber", "PartNumber", "Revision", "Temperature", "WarnTemperature", "AlarmTemperature", });
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkFSMRecord_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_cloud_v1alpha1_PortLinkFSMRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_cloud_v1alpha1_PortLinkFSMRecord_descriptor,
        new java.lang.String[] { "FsmState", "StateTime", "Duration", });
    opi_api.common.v1.ObjectKeyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
