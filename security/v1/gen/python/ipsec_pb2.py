# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ipsec.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x0bipsec.proto\x12\x13opi_api.security.v1\"\xf1\x01\n\tProposals\x12\x38\n\ncrypto_alg\x18\x01 \x03(\x0e\x32$.opi_api.security.v1.CryptoAlgorithm\x12\x36\n\tinteg_alg\x18\x02 \x03(\x0e\x32#.opi_api.security.v1.IntegAlgorithm\x12\x36\n\x03prf\x18\x03 \x03(\x0e\x32).opi_api.security.v1.PseudoRandomFunction\x12:\n\x08\x64hgroups\x18\x04 \x03(\x0e\x32(.opi_api.security.v1.DiffieHellmanGroups\"\x13\n\x04Vips\x12\x0b\n\x03vip\x18\x01 \x03(\t\"\x15\n\x05Pools\x12\x0c\n\x04pool\x18\x01 \x03(\t\"\x15\n\x05\x43\x65rts\x12\x0c\n\x04\x63\x65rt\x18\x01 \x03(\t\"\x19\n\x07PubKeys\x12\x0e\n\x06pubkey\x18\x01 \x03(\t\"\x17\n\x06Groups\x12\r\n\x05group\x18\x01 \x03(\t\"!\n\nCertPolicy\x12\x13\n\x0b\x63\x65rt_policy\x18\x01 \x03(\t\"\x19\n\x07\x43\x61\x43\x65rts\x12\x0e\n\x06\x63\x61\x63\x65rt\x18\x01 \x03(\t\"\xd0\x01\n\tLocalAuth\x12+\n\x04\x61uth\x18\x01 \x01(\x0e\x32\x1d.opi_api.security.v1.AuthType\x12\n\n\x02id\x18\x02 \x01(\t\x12\x0e\n\x06\x65\x61p_id\x18\x03 \x01(\t\x12\x0e\n\x06\x61\x61\x61_id\x18\x04 \x01(\t\x12\x10\n\x08xauth_id\x18\x05 \x01(\t\x12)\n\x05\x63\x65rts\x18\x06 \x01(\x0b\x32\x1a.opi_api.security.v1.Certs\x12-\n\x07pubkeys\x18\x07 \x01(\x0b\x32\x1c.opi_api.security.v1.PubKeys\"\xc2\x02\n\nRemoteAuth\x12+\n\x04\x61uth\x18\x01 \x01(\x0e\x32\x1d.opi_api.security.v1.AuthType\x12\n\n\x02id\x18\x02 \x01(\t\x12\x0e\n\x06\x65\x61p_id\x18\x03 \x01(\t\x12+\n\x06groups\x18\x04 \x01(\x0b\x32\x1b.opi_api.security.v1.Groups\x12\x34\n\x0b\x63\x65rt_policy\x18\x05 \x01(\x0b\x32\x1f.opi_api.security.v1.CertPolicy\x12)\n\x05\x63\x65rts\x18\x06 \x01(\x0b\x32\x1a.opi_api.security.v1.Certs\x12.\n\x08\x63\x61_certs\x18\x07 \x01(\x0b\x32\x1c.opi_api.security.v1.CaCerts\x12-\n\x07pubkeys\x18\x08 \x01(\x0b\x32\x1c.opi_api.security.v1.PubKeys\"\x93\x01\n\x10TrafficSelectors\x12\x41\n\x02ts\x18\x01 \x03(\x0b\x32\x35.opi_api.security.v1.TrafficSelectors.TrafficSelector\x1a<\n\x0fTrafficSelector\x12\x0c\n\x04\x63idr\x18\x01 \x01(\t\x12\r\n\x05proto\x18\x02 \x01(\t\x12\x0c\n\x04port\x18\x03 \x01(\t\"\x15\n\x05\x41\x64\x64rs\x12\x0c\n\x04\x61\x64\x64r\x18\x01 \x01(\t\"\xc9\x03\n\x05\x43hild\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x34\n\x0c\x61g_proposals\x18\x02 \x01(\x0b\x32\x1e.opi_api.security.v1.Proposals\x12\x35\n\resp_proposals\x18\x03 \x01(\x0b\x32\x1e.opi_api.security.v1.Proposals\x12\x37\n\x08local_ts\x18\x04 \x01(\x0b\x32%.opi_api.security.v1.TrafficSelectors\x12\x38\n\tremote_ts\x18\x05 \x01(\x0b\x32%.opi_api.security.v1.TrafficSelectors\x12\x12\n\nrekey_time\x18\x06 \x01(\r\x12\x11\n\tlife_time\x18\x07 \x01(\r\x12\x11\n\trand_time\x18\x08 \x01(\r\x12\x0e\n\x06updown\x18\t \x01(\t\x12\x12\n\ninactivity\x18\n \x01(\r\x12\x0f\n\x07mark_in\x18\x0b \x01(\r\x12\x12\n\nmark_in_sa\x18\x0c \x01(\t\x12\x10\n\x08mark_out\x18\r \x01(\r\x12\x13\n\x0bset_mark_in\x18\x0e \x01(\r\x12\x14\n\x0cset_mark_out\x18\x0f \x01(\r\x12\x12\n\nhw_offload\x18\x10 \x01(\t\"\xd4\x04\n\nConnection\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12/\n\x0blocal_addrs\x18\x03 \x03(\x0b\x32\x1a.opi_api.security.v1.Addrs\x12\x30\n\x0cremote_addrs\x18\x04 \x03(\x0b\x32\x1a.opi_api.security.v1.Addrs\x12\x12\n\nlocal_port\x18\x05 \x01(\r\x12\x13\n\x0bremote_port\x18\x06 \x01(\r\x12\x31\n\tproposals\x18\x07 \x01(\x0b\x32\x1e.opi_api.security.v1.Proposals\x12\'\n\x04vips\x18\x08 \x01(\x0b\x32\x19.opi_api.security.v1.Vips\x12\x0c\n\x04\x64scp\x18\t \x01(\x04\x12\r\n\x05\x65ncap\x18\n \x01(\t\x12\x0e\n\x06mobike\x18\x0b \x01(\t\x12\x11\n\tdpd_delay\x18\x0c \x01(\r\x12\x13\n\x0b\x64pd_timeout\x18\r \x01(\r\x12\x13\n\x0breauth_time\x18\x0e \x01(\r\x12\x12\n\nrekey_time\x18\x0f \x01(\r\x12)\n\x05pools\x18\x10 \x01(\x0b\x32\x1a.opi_api.security.v1.Pools\x12\x32\n\nlocal_auth\x18\x11 \x01(\x0b\x32\x1e.opi_api.security.v1.LocalAuth\x12\x34\n\x0bremote_auth\x18\x12 \x01(\x0b\x32\x1f.opi_api.security.v1.RemoteAuth\x12,\n\x08\x63hildren\x18\x13 \x03(\x0b\x32\x1a.opi_api.security.v1.Child\"\x15\n\x04Uuid\x12\r\n\x05value\x18\x01 \x01(\t\"\x11\n\x0fIPsecVersionReq\"f\n\x10IPsecVersionResp\x12\x0e\n\x06\x64\x61\x65mon\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\x0f\n\x07sysname\x18\x03 \x01(\t\x12\x0f\n\x07release\x18\x04 \x01(\t\x12\x0f\n\x07machine\x18\x05 \x01(\t\"\x0f\n\rIPsecStatsReq\" \n\x0eIPsecStatsResp\x12\x0e\n\x06status\x18\x01 \x01(\t\"Q\n\x10IPsecInitiateReq\x12\r\n\x05\x63hild\x18\x01 \x01(\t\x12\x0b\n\x03ike\x18\x02 \x01(\t\x12\x0f\n\x07timeout\x18\x03 \x01(\t\x12\x10\n\x08loglevel\x18\x04 \x01(\t\"\x13\n\x11IPsecInitiateResp\"\x83\x01\n\x11IPsecTerminateReq\x12\r\n\x05\x63hild\x18\x01 \x01(\t\x12\x0b\n\x03ike\x18\x02 \x01(\t\x12\x10\n\x08\x63hild_id\x18\x03 \x01(\x04\x12\x0e\n\x06ike_id\x18\x04 \x01(\x04\x12\r\n\x05\x66orce\x18\x05 \x01(\t\x12\x0f\n\x07timeout\x18\x06 \x01(\t\x12\x10\n\x08loglevel\x18\x07 \x01(\t\"J\n\x12IPsecTerminateResp\x12\x0f\n\x07success\x18\x01 \x01(\t\x12\x0f\n\x07matches\x18\x02 \x01(\r\x12\x12\n\nterminated\x18\x03 \x01(\r\"]\n\rIPsecRekeyReq\x12\r\n\x05\x63hild\x18\x01 \x01(\t\x12\x0b\n\x03ike\x18\x02 \x01(\t\x12\x10\n\x08\x63hild_id\x18\x03 \x01(\x04\x12\x0e\n\x06ike_id\x18\x04 \x01(\x04\x12\x0e\n\x06reauth\x18\x05 \x01(\t\"2\n\x0eIPsecRekeyResp\x12\x0f\n\x07success\x18\x01 \x01(\t\x12\x0f\n\x07matches\x18\x02 \x01(\r\"`\n\x0fIPsecListSasReq\x12\x0f\n\x07noblock\x18\x01 \x01(\t\x12\x0b\n\x03ike\x18\x02 \x01(\t\x12\x0e\n\x06ike_id\x18\x03 \x01(\x04\x12\r\n\x05\x63hild\x18\x04 \x01(\t\x12\x10\n\x08\x63hild_id\x18\x05 \x01(\x04\"\xe4\x02\n\x0bListChildSa\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x10\n\x08protocol\x18\x02 \x01(\t\x12\r\n\x05\x65ncap\x18\x03 \x01(\t\x12\x0e\n\x06spi_in\x18\x04 \x01(\t\x12\x0f\n\x07spi_out\x18\x05 \x01(\t\x12\x0e\n\x06\x63pi_in\x18\x06 \x01(\t\x12\x0f\n\x07\x63pi_out\x18\x07 \x01(\t\x12\x0f\n\x07mark_in\x18\x08 \x01(\t\x12\x14\n\x0cmark_mask_in\x18\t \x01(\t\x12\x10\n\x08mark_out\x18\n \x01(\t\x12\x15\n\rmark_mask_out\x18\x0b \x01(\t\x12\x10\n\x08if_id_in\x18\x0c \x01(\t\x12\x11\n\tif_id_out\x18\r \x01(\t\x12\x10\n\x08\x65ncr_alg\x18\x0e \x01(\t\x12\x14\n\x0c\x65ncr_keysize\x18\x0f \x01(\t\x12\x11\n\tinteg_alg\x18\x10 \x01(\t\x12\x15\n\rinteg_keysize\x18\x11 \x01(\t\x12\x10\n\x08\x64h_group\x18\x12 \x01(\t\x12\x0b\n\x03\x65sn\x18\x13 \x01(\t\"\xa6\x06\n\tListIkeSa\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x10\n\x08uniqueid\x18\x02 \x01(\t\x12\x0f\n\x07version\x18\x03 \x01(\t\x12\x31\n\x08ikestate\x18\x04 \x01(\x0e\x32\x1f.opi_api.security.v1.IkeSaState\x12\x12\n\nlocal_host\x18\x05 \x01(\t\x12\x12\n\nlocal_port\x18\x06 \x01(\t\x12\x10\n\x08local_id\x18\x07 \x01(\t\x12\x13\n\x0bremote_host\x18\x08 \x01(\t\x12\x13\n\x0bremote_port\x18\t \x01(\t\x12\x11\n\tremote_id\x18\n \x01(\t\x12\x17\n\x0fremote_xauth_id\x18\x0b \x01(\t\x12\x15\n\rremote_eap_id\x18\x0c \x01(\t\x12\x11\n\tinitiator\x18\r \x01(\t\x12\x15\n\rinitiator_spi\x18\x0e \x01(\t\x12\x15\n\rresponder_spi\x18\x0f \x01(\t\x12\x11\n\tnat_local\x18\x10 \x01(\t\x12\x12\n\nnat_remote\x18\x11 \x01(\t\x12\x10\n\x08nat_fake\x18\x12 \x01(\t\x12\x0f\n\x07nat_any\x18\x13 \x01(\t\x12\x10\n\x08if_id_in\x18\x14 \x01(\t\x12\x11\n\tif_id_out\x18\x15 \x01(\t\x12\x10\n\x08\x65ncr_alg\x18\x16 \x01(\t\x12\x14\n\x0c\x65ncr_keysize\x18\x17 \x01(\t\x12\x11\n\tinteg_alg\x18\x18 \x01(\t\x12\x15\n\rinteg_keysize\x18\x19 \x01(\t\x12\x0f\n\x07prf_alg\x18\x1a \x01(\t\x12\x10\n\x08\x64h_group\x18\x1b \x01(\t\x12\x0b\n\x03ppk\x18\x1c \x01(\t\x12\x13\n\x0b\x65stablished\x18\x1d \x01(\t\x12\x12\n\nrekey_time\x18\x1e \x01(\t\x12\x13\n\x0breauth_time\x18\x1f \x01(\t\x12\x12\n\nlocal_vips\x18  \x03(\t\x12\x13\n\x0bremote_vips\x18! \x03(\t\x12\x14\n\x0ctasks_queued\x18\" \x03(\t\x12\x14\n\x0ctasks_active\x18# \x03(\t\x12\x15\n\rtasks_passive\x18$ \x03(\t\x12\x32\n\x08\x63hildsas\x18% \x03(\x0b\x32 .opi_api.security.v1.ListChildSa\"B\n\x10IPsecListSasResp\x12.\n\x06ikesas\x18\x01 \x03(\x0b\x32\x1e.opi_api.security.v1.ListIkeSa\" \n\x11IPsecListConnsReq\x12\x0b\n\x03ike\x18\x01 \x01(\t\"\xed\x02\n\x0cListConnAuth\x12\r\n\x05\x63lass\x18\x01 \x01(\t\x12\x0f\n\x07\x65\x61ptype\x18\x02 \x01(\t\x12\x11\n\teapvendor\x18\x03 \x01(\t\x12\r\n\x05xauth\x18\x04 \x01(\t\x12\x12\n\nrevocation\x18\x05 \x01(\t\x12\n\n\x02id\x18\x06 \x01(\t\x12\r\n\x05\x63\x61_id\x18\x07 \x01(\t\x12\x0e\n\x06\x61\x61\x61_id\x18\x08 \x01(\t\x12\x0e\n\x06\x65\x61p_id\x18\t \x01(\t\x12\x10\n\x08xauth_id\x18\n \x01(\t\x12*\n\x05group\x18\x0b \x01(\x0b\x32\x1b.opi_api.security.v1.Groups\x12\x34\n\x0b\x63\x65rt_policy\x18\x0c \x01(\x0b\x32\x1f.opi_api.security.v1.CertPolicy\x12)\n\x05\x63\x65rts\x18\r \x01(\x0b\x32\x1a.opi_api.security.v1.Certs\x12-\n\x07\x63\x61\x63\x65rts\x18\x0e \x01(\x0b\x32\x1c.opi_api.security.v1.CaCerts\"\xb8\x02\n\tListChild\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04mode\x18\x02 \x01(\t\x12\r\n\x05label\x18\x03 \x01(\t\x12\x12\n\nrekey_time\x18\x04 \x01(\r\x12\x13\n\x0brekey_bytes\x18\x05 \x01(\r\x12\x15\n\rrekey_packets\x18\x06 \x01(\r\x12\x12\n\ndpd_action\x18\x07 \x01(\t\x12\x14\n\x0c\x63lose_action\x18\x08 \x01(\t\x12\x37\n\x08local_ts\x18\t \x01(\x0b\x32%.opi_api.security.v1.TrafficSelectors\x12\x38\n\tremote_ts\x18\n \x01(\x0b\x32%.opi_api.security.v1.TrafficSelectors\x12\x11\n\tinterface\x18\x0b \x01(\t\x12\x10\n\x08priority\x18\x0c \x01(\t\"\xb5\x03\n\x0cListConnResp\x12\x0c\n\x04name\x18\x01 \x01(\t\x12/\n\x0blocal_addrs\x18\x02 \x03(\x0b\x32\x1a.opi_api.security.v1.Addrs\x12\x30\n\x0cremote_addrs\x18\x03 \x03(\x0b\x32\x1a.opi_api.security.v1.Addrs\x12\x0f\n\x07version\x18\x04 \x01(\t\x12\x13\n\x0breauth_time\x18\x05 \x01(\r\x12\x12\n\nrekey_time\x18\x06 \x01(\r\x12\x0e\n\x06unique\x18\x07 \x01(\t\x12\x11\n\tdpd_delay\x18\x08 \x01(\r\x12\x13\n\x0b\x64pd_timeout\x18\t \x01(\r\x12\x0b\n\x03ppk\x18\n \x01(\t\x12\x14\n\x0cppk_required\x18\x0b \x01(\t\x12\x35\n\nlocal_auth\x18\x0c \x03(\x0b\x32!.opi_api.security.v1.ListConnAuth\x12\x36\n\x0bremote_auth\x18\r \x03(\x0b\x32!.opi_api.security.v1.ListConnAuth\x12\x30\n\x08\x63hildren\x18\x0e \x03(\x0b\x32\x1e.opi_api.security.v1.ListChild\"K\n\x12IPsecListConnsResp\x12\x35\n\nconnection\x18\x01 \x03(\x0b\x32!.opi_api.security.v1.ListConnResp\"@\n\x11IPsecListCertsReq\x12\x0c\n\x04type\x18\x01 \x01(\t\x12\x0c\n\x04\x66lag\x18\x02 \x01(\t\x12\x0f\n\x07subject\x18\x03 \x01(\t\"\xce\x01\n\x08ListCert\x12\x32\n\x04type\x18\x01 \x01(\x0e\x32$.opi_api.security.v1.CertificateType\x12\x36\n\x04\x66lag\x18\x02 \x01(\x0e\x32(.opi_api.security.v1.X509CertificateFlag\x12\x12\n\nhasprivkey\x18\x03 \x01(\t\x12\x0c\n\x04\x64\x61ta\x18\x04 \x01(\t\x12\x0f\n\x07subject\x18\x05 \x01(\t\x12\x11\n\tnotbefore\x18\x06 \x01(\t\x12\x10\n\x08notafter\x18\x07 \x01(\t\"B\n\x12IPsecListCertsResp\x12,\n\x05\x63\x65rts\x18\x01 \x03(\x0b\x32\x1d.opi_api.security.v1.ListCert\"G\n\x10IPsecLoadConnReq\x12\x33\n\nconnection\x18\x01 \x01(\x0b\x32\x1f.opi_api.security.v1.Connection\"$\n\x11IPsecLoadConnResp\x12\x0f\n\x07success\x18\x01 \x01(\t\"\"\n\x12IPsecUnloadConnReq\x12\x0c\n\x04name\x18\x01 \x01(\t\"&\n\x13IPsecUnloadConnResp\x12\x0f\n\x07success\x18\x01 \x01(\t*\x8a\x01\n\x0f\x43ryptoAlgorithm\x12\x0f\n\x0bNONE_CRYPTO\x10\x00\x12\n\n\x06\x41\x45S128\x10\x01\x12\n\n\x06\x41\x45S192\x10\x02\x12\n\n\x06\x41\x45S256\x10\x03\x12\x10\n\x0c\x41\x45S128GCM128\x10\x04\x12\x10\n\x0c\x41\x45S256GCM128\x10\x05\x12\x0e\n\nAES128GMAC\x10\x06\x12\x0e\n\nAES256GMAC\x10\x07*\x81\x01\n\x0eIntegAlgorithm\x12\x0e\n\nNONE_INTEG\x10\x00\x12\x07\n\x03MD5\x10\x01\x12\x0b\n\x07MD5_128\x10\x02\x12\x08\n\x04SHA1\x10\x03\x12\x0c\n\x08SHA1_160\x10\x04\x12\n\n\x06SHA256\x10\x05\x12\n\n\x06SHA384\x10\x07\x12\n\n\x06SHA512\x10\x08\x12\r\n\tSHA256_96\x10\t*\xdd\x01\n\x13\x44iffieHellmanGroups\x12\x11\n\rNONE_DH_GROUP\x10\x00\x12\x0b\n\x07MODP768\x10\x01\x12\x0c\n\x08MODP1024\x10\x02\x12\x0c\n\x08MODP1536\x10\x03\x12\x0c\n\x08MODP2048\x10\x04\x12\x0c\n\x08MODP3072\x10\x05\x12\x0c\n\x08MODP4096\x10\x06\x12\x0c\n\x08MODP6144\x10\x07\x12\x0c\n\x08MODP8192\x10\x08\x12\x10\n\x0cMODP1024S160\x10\t\x12\x10\n\x0cMODP2048S224\x10\n\x12\x10\n\x0cMODP2048S256\x10\x0b\x12\x0e\n\nCURVE25519\x10\x0c*\x8a\x01\n\x14PseudoRandomFunction\x12\x0c\n\x08NONE_PRF\x10\x00\x12\n\n\x06PRFMD5\x10\x01\x12\x0b\n\x07PRFSHA1\x10\x02\x12\x0e\n\nPRFAESXCBC\x10\x03\x12\x0e\n\nPRFAESCMAC\x10\x04\x12\r\n\tPRFSHA256\x10\x05\x12\r\n\tPRFSHA384\x10\x06\x12\r\n\tPRFSHA512\x10\x07*0\n\tIPsecMode\x12\x0f\n\x0bTUNNEL_MODE\x10\x00\x12\x12\n\x0eTRANSPORT_MODE\x10\x01*3\n\x08\x41uthType\x12\n\n\x06PUBKEY\x10\x00\x12\x07\n\x03PSK\x10\x01\x12\t\n\x05XAUTH\x10\x02\x12\x07\n\x03\x45\x41P\x10\x03*\x80\x01\n\nIkeSaState\x12\x0b\n\x07\x43REATED\x10\x00\x12\x0e\n\nCONNECTING\x10\x01\x12\x0f\n\x0b\x45STABLISHED\x10\x02\x12\x0b\n\x07PASSIVE\x10\x03\x12\x0c\n\x08REKEYING\x10\x04\x12\x0b\n\x07REKEYED\x10\x05\x12\x0c\n\x08\x44\x45LETING\x10\x06\x12\x0e\n\nDESTROYING\x10\x07*\xea\x01\n\x0c\x43hildSaState\x12\x11\n\rCHILD_CREATED\x10\x00\x12\x10\n\x0c\x43HILD_ROUTED\x10\x01\x12\x14\n\x10\x43HILD_INSTALLING\x10\x02\x12\x13\n\x0f\x43HILD_INSTALLED\x10\x03\x12\x12\n\x0e\x43HILD_UPDATING\x10\x04\x12\x12\n\x0e\x43HILD_REKEYING\x10\x05\x12\x11\n\rCHILD_REKEYED\x10\x06\x12\x12\n\x0e\x43HILD_RETRYING\x10\x07\x12\x12\n\x0e\x43HILD_DELETING\x10\x08\x12\x11\n\rCHILD_DELETED\x10\t\x12\x14\n\x10\x43HILD_DESTROYING\x10\n*n\n\x0f\x43\x65rtificateType\x12\r\n\tCERT_X509\x10\x00\x12\x10\n\x0c\x43\x45RT_X509_AC\x10\x01\x12\x11\n\rCERT_X509_CRL\x10\x02\x12\x16\n\x12\x43\x45RT_OCSP_RESPONSE\x10\x03\x12\x0f\n\x0b\x43\x45RT_PUBKEY\x10\x04*u\n\x13X509CertificateFlag\x12\x17\n\x13X509_CERT_FLAG_NONE\x10\x00\x12\x15\n\x11X509_CERT_FLAG_CA\x10\x01\x12\x15\n\x11X509_CERT_FLAG_AA\x10\x02\x12\x17\n\x13X509_CERT_FLAG_OCSP\x10\x03\x32\xd2\x07\n\x05IPsec\x12]\n\x0cIPsecVersion\x12$.opi_api.security.v1.IPsecVersionReq\x1a%.opi_api.security.v1.IPsecVersionResp\"\x00\x12W\n\nIPsecStats\x12\".opi_api.security.v1.IPsecStatsReq\x1a#.opi_api.security.v1.IPsecStatsResp\"\x00\x12`\n\rIPsecInitiate\x12%.opi_api.security.v1.IPsecInitiateReq\x1a&.opi_api.security.v1.IPsecInitiateResp\"\x00\x12\x63\n\x0eIPsecTerminate\x12&.opi_api.security.v1.IPsecTerminateReq\x1a\'.opi_api.security.v1.IPsecTerminateResp\"\x00\x12W\n\nIPsecRekey\x12\".opi_api.security.v1.IPsecRekeyReq\x1a#.opi_api.security.v1.IPsecRekeyResp\"\x00\x12]\n\x0cIPsecListSas\x12$.opi_api.security.v1.IPsecListSasReq\x1a%.opi_api.security.v1.IPsecListSasResp\"\x00\x12\x63\n\x0eIPsecListConns\x12&.opi_api.security.v1.IPsecListConnsReq\x1a\'.opi_api.security.v1.IPsecListConnsResp\"\x00\x12\x63\n\x0eIPsecListCerts\x12&.opi_api.security.v1.IPsecListCertsReq\x1a\'.opi_api.security.v1.IPsecListCertsResp\"\x00\x12`\n\rIPsecLoadConn\x12%.opi_api.security.v1.IPsecLoadConnReq\x1a&.opi_api.security.v1.IPsecLoadConnResp\"\x00\x12\x66\n\x0fIPsecUnloadConn\x12\'.opi_api.security.v1.IPsecUnloadConnReq\x1a(.opi_api.security.v1.IPsecUnloadConnResp\"\x00\x42+Z)github.com/opiproject/opi-api/security/v1b\x06proto3')

_CRYPTOALGORITHM = DESCRIPTOR.enum_types_by_name['CryptoAlgorithm']
CryptoAlgorithm = enum_type_wrapper.EnumTypeWrapper(_CRYPTOALGORITHM)
_INTEGALGORITHM = DESCRIPTOR.enum_types_by_name['IntegAlgorithm']
IntegAlgorithm = enum_type_wrapper.EnumTypeWrapper(_INTEGALGORITHM)
_DIFFIEHELLMANGROUPS = DESCRIPTOR.enum_types_by_name['DiffieHellmanGroups']
DiffieHellmanGroups = enum_type_wrapper.EnumTypeWrapper(_DIFFIEHELLMANGROUPS)
_PSEUDORANDOMFUNCTION = DESCRIPTOR.enum_types_by_name['PseudoRandomFunction']
PseudoRandomFunction = enum_type_wrapper.EnumTypeWrapper(_PSEUDORANDOMFUNCTION)
_IPSECMODE = DESCRIPTOR.enum_types_by_name['IPsecMode']
IPsecMode = enum_type_wrapper.EnumTypeWrapper(_IPSECMODE)
_AUTHTYPE = DESCRIPTOR.enum_types_by_name['AuthType']
AuthType = enum_type_wrapper.EnumTypeWrapper(_AUTHTYPE)
_IKESASTATE = DESCRIPTOR.enum_types_by_name['IkeSaState']
IkeSaState = enum_type_wrapper.EnumTypeWrapper(_IKESASTATE)
_CHILDSASTATE = DESCRIPTOR.enum_types_by_name['ChildSaState']
ChildSaState = enum_type_wrapper.EnumTypeWrapper(_CHILDSASTATE)
_CERTIFICATETYPE = DESCRIPTOR.enum_types_by_name['CertificateType']
CertificateType = enum_type_wrapper.EnumTypeWrapper(_CERTIFICATETYPE)
_X509CERTIFICATEFLAG = DESCRIPTOR.enum_types_by_name['X509CertificateFlag']
X509CertificateFlag = enum_type_wrapper.EnumTypeWrapper(_X509CERTIFICATEFLAG)
NONE_CRYPTO = 0
AES128 = 1
AES192 = 2
AES256 = 3
AES128GCM128 = 4
AES256GCM128 = 5
AES128GMAC = 6
AES256GMAC = 7
NONE_INTEG = 0
MD5 = 1
MD5_128 = 2
SHA1 = 3
SHA1_160 = 4
SHA256 = 5
SHA384 = 7
SHA512 = 8
SHA256_96 = 9
NONE_DH_GROUP = 0
MODP768 = 1
MODP1024 = 2
MODP1536 = 3
MODP2048 = 4
MODP3072 = 5
MODP4096 = 6
MODP6144 = 7
MODP8192 = 8
MODP1024S160 = 9
MODP2048S224 = 10
MODP2048S256 = 11
CURVE25519 = 12
NONE_PRF = 0
PRFMD5 = 1
PRFSHA1 = 2
PRFAESXCBC = 3
PRFAESCMAC = 4
PRFSHA256 = 5
PRFSHA384 = 6
PRFSHA512 = 7
TUNNEL_MODE = 0
TRANSPORT_MODE = 1
PUBKEY = 0
PSK = 1
XAUTH = 2
EAP = 3
CREATED = 0
CONNECTING = 1
ESTABLISHED = 2
PASSIVE = 3
REKEYING = 4
REKEYED = 5
DELETING = 6
DESTROYING = 7
CHILD_CREATED = 0
CHILD_ROUTED = 1
CHILD_INSTALLING = 2
CHILD_INSTALLED = 3
CHILD_UPDATING = 4
CHILD_REKEYING = 5
CHILD_REKEYED = 6
CHILD_RETRYING = 7
CHILD_DELETING = 8
CHILD_DELETED = 9
CHILD_DESTROYING = 10
CERT_X509 = 0
CERT_X509_AC = 1
CERT_X509_CRL = 2
CERT_OCSP_RESPONSE = 3
CERT_PUBKEY = 4
X509_CERT_FLAG_NONE = 0
X509_CERT_FLAG_CA = 1
X509_CERT_FLAG_AA = 2
X509_CERT_FLAG_OCSP = 3


_PROPOSALS = DESCRIPTOR.message_types_by_name['Proposals']
_VIPS = DESCRIPTOR.message_types_by_name['Vips']
_POOLS = DESCRIPTOR.message_types_by_name['Pools']
_CERTS = DESCRIPTOR.message_types_by_name['Certs']
_PUBKEYS = DESCRIPTOR.message_types_by_name['PubKeys']
_GROUPS = DESCRIPTOR.message_types_by_name['Groups']
_CERTPOLICY = DESCRIPTOR.message_types_by_name['CertPolicy']
_CACERTS = DESCRIPTOR.message_types_by_name['CaCerts']
_LOCALAUTH = DESCRIPTOR.message_types_by_name['LocalAuth']
_REMOTEAUTH = DESCRIPTOR.message_types_by_name['RemoteAuth']
_TRAFFICSELECTORS = DESCRIPTOR.message_types_by_name['TrafficSelectors']
_TRAFFICSELECTORS_TRAFFICSELECTOR = _TRAFFICSELECTORS.nested_types_by_name['TrafficSelector']
_ADDRS = DESCRIPTOR.message_types_by_name['Addrs']
_CHILD = DESCRIPTOR.message_types_by_name['Child']
_CONNECTION = DESCRIPTOR.message_types_by_name['Connection']
_UUID = DESCRIPTOR.message_types_by_name['Uuid']
_IPSECVERSIONREQ = DESCRIPTOR.message_types_by_name['IPsecVersionReq']
_IPSECVERSIONRESP = DESCRIPTOR.message_types_by_name['IPsecVersionResp']
_IPSECSTATSREQ = DESCRIPTOR.message_types_by_name['IPsecStatsReq']
_IPSECSTATSRESP = DESCRIPTOR.message_types_by_name['IPsecStatsResp']
_IPSECINITIATEREQ = DESCRIPTOR.message_types_by_name['IPsecInitiateReq']
_IPSECINITIATERESP = DESCRIPTOR.message_types_by_name['IPsecInitiateResp']
_IPSECTERMINATEREQ = DESCRIPTOR.message_types_by_name['IPsecTerminateReq']
_IPSECTERMINATERESP = DESCRIPTOR.message_types_by_name['IPsecTerminateResp']
_IPSECREKEYREQ = DESCRIPTOR.message_types_by_name['IPsecRekeyReq']
_IPSECREKEYRESP = DESCRIPTOR.message_types_by_name['IPsecRekeyResp']
_IPSECLISTSASREQ = DESCRIPTOR.message_types_by_name['IPsecListSasReq']
_LISTCHILDSA = DESCRIPTOR.message_types_by_name['ListChildSa']
_LISTIKESA = DESCRIPTOR.message_types_by_name['ListIkeSa']
_IPSECLISTSASRESP = DESCRIPTOR.message_types_by_name['IPsecListSasResp']
_IPSECLISTCONNSREQ = DESCRIPTOR.message_types_by_name['IPsecListConnsReq']
_LISTCONNAUTH = DESCRIPTOR.message_types_by_name['ListConnAuth']
_LISTCHILD = DESCRIPTOR.message_types_by_name['ListChild']
_LISTCONNRESP = DESCRIPTOR.message_types_by_name['ListConnResp']
_IPSECLISTCONNSRESP = DESCRIPTOR.message_types_by_name['IPsecListConnsResp']
_IPSECLISTCERTSREQ = DESCRIPTOR.message_types_by_name['IPsecListCertsReq']
_LISTCERT = DESCRIPTOR.message_types_by_name['ListCert']
_IPSECLISTCERTSRESP = DESCRIPTOR.message_types_by_name['IPsecListCertsResp']
_IPSECLOADCONNREQ = DESCRIPTOR.message_types_by_name['IPsecLoadConnReq']
_IPSECLOADCONNRESP = DESCRIPTOR.message_types_by_name['IPsecLoadConnResp']
_IPSECUNLOADCONNREQ = DESCRIPTOR.message_types_by_name['IPsecUnloadConnReq']
_IPSECUNLOADCONNRESP = DESCRIPTOR.message_types_by_name['IPsecUnloadConnResp']
Proposals = _reflection.GeneratedProtocolMessageType('Proposals', (_message.Message,), {
  'DESCRIPTOR' : _PROPOSALS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Proposals)
  })
_sym_db.RegisterMessage(Proposals)

Vips = _reflection.GeneratedProtocolMessageType('Vips', (_message.Message,), {
  'DESCRIPTOR' : _VIPS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Vips)
  })
_sym_db.RegisterMessage(Vips)

Pools = _reflection.GeneratedProtocolMessageType('Pools', (_message.Message,), {
  'DESCRIPTOR' : _POOLS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Pools)
  })
_sym_db.RegisterMessage(Pools)

Certs = _reflection.GeneratedProtocolMessageType('Certs', (_message.Message,), {
  'DESCRIPTOR' : _CERTS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Certs)
  })
_sym_db.RegisterMessage(Certs)

PubKeys = _reflection.GeneratedProtocolMessageType('PubKeys', (_message.Message,), {
  'DESCRIPTOR' : _PUBKEYS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.PubKeys)
  })
_sym_db.RegisterMessage(PubKeys)

Groups = _reflection.GeneratedProtocolMessageType('Groups', (_message.Message,), {
  'DESCRIPTOR' : _GROUPS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Groups)
  })
_sym_db.RegisterMessage(Groups)

CertPolicy = _reflection.GeneratedProtocolMessageType('CertPolicy', (_message.Message,), {
  'DESCRIPTOR' : _CERTPOLICY,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.CertPolicy)
  })
_sym_db.RegisterMessage(CertPolicy)

CaCerts = _reflection.GeneratedProtocolMessageType('CaCerts', (_message.Message,), {
  'DESCRIPTOR' : _CACERTS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.CaCerts)
  })
_sym_db.RegisterMessage(CaCerts)

LocalAuth = _reflection.GeneratedProtocolMessageType('LocalAuth', (_message.Message,), {
  'DESCRIPTOR' : _LOCALAUTH,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.LocalAuth)
  })
_sym_db.RegisterMessage(LocalAuth)

RemoteAuth = _reflection.GeneratedProtocolMessageType('RemoteAuth', (_message.Message,), {
  'DESCRIPTOR' : _REMOTEAUTH,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.RemoteAuth)
  })
_sym_db.RegisterMessage(RemoteAuth)

TrafficSelectors = _reflection.GeneratedProtocolMessageType('TrafficSelectors', (_message.Message,), {

  'TrafficSelector' : _reflection.GeneratedProtocolMessageType('TrafficSelector', (_message.Message,), {
    'DESCRIPTOR' : _TRAFFICSELECTORS_TRAFFICSELECTOR,
    '__module__' : 'ipsec_pb2'
    # @@protoc_insertion_point(class_scope:opi_api.security.v1.TrafficSelectors.TrafficSelector)
    })
  ,
  'DESCRIPTOR' : _TRAFFICSELECTORS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.TrafficSelectors)
  })
_sym_db.RegisterMessage(TrafficSelectors)
_sym_db.RegisterMessage(TrafficSelectors.TrafficSelector)

Addrs = _reflection.GeneratedProtocolMessageType('Addrs', (_message.Message,), {
  'DESCRIPTOR' : _ADDRS,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Addrs)
  })
_sym_db.RegisterMessage(Addrs)

Child = _reflection.GeneratedProtocolMessageType('Child', (_message.Message,), {
  'DESCRIPTOR' : _CHILD,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Child)
  })
_sym_db.RegisterMessage(Child)

Connection = _reflection.GeneratedProtocolMessageType('Connection', (_message.Message,), {
  'DESCRIPTOR' : _CONNECTION,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Connection)
  })
_sym_db.RegisterMessage(Connection)

Uuid = _reflection.GeneratedProtocolMessageType('Uuid', (_message.Message,), {
  'DESCRIPTOR' : _UUID,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.Uuid)
  })
_sym_db.RegisterMessage(Uuid)

IPsecVersionReq = _reflection.GeneratedProtocolMessageType('IPsecVersionReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECVERSIONREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecVersionReq)
  })
_sym_db.RegisterMessage(IPsecVersionReq)

IPsecVersionResp = _reflection.GeneratedProtocolMessageType('IPsecVersionResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECVERSIONRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecVersionResp)
  })
_sym_db.RegisterMessage(IPsecVersionResp)

IPsecStatsReq = _reflection.GeneratedProtocolMessageType('IPsecStatsReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECSTATSREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecStatsReq)
  })
_sym_db.RegisterMessage(IPsecStatsReq)

IPsecStatsResp = _reflection.GeneratedProtocolMessageType('IPsecStatsResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECSTATSRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecStatsResp)
  })
_sym_db.RegisterMessage(IPsecStatsResp)

IPsecInitiateReq = _reflection.GeneratedProtocolMessageType('IPsecInitiateReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECINITIATEREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecInitiateReq)
  })
_sym_db.RegisterMessage(IPsecInitiateReq)

IPsecInitiateResp = _reflection.GeneratedProtocolMessageType('IPsecInitiateResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECINITIATERESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecInitiateResp)
  })
_sym_db.RegisterMessage(IPsecInitiateResp)

IPsecTerminateReq = _reflection.GeneratedProtocolMessageType('IPsecTerminateReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECTERMINATEREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecTerminateReq)
  })
_sym_db.RegisterMessage(IPsecTerminateReq)

IPsecTerminateResp = _reflection.GeneratedProtocolMessageType('IPsecTerminateResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECTERMINATERESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecTerminateResp)
  })
_sym_db.RegisterMessage(IPsecTerminateResp)

IPsecRekeyReq = _reflection.GeneratedProtocolMessageType('IPsecRekeyReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECREKEYREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecRekeyReq)
  })
_sym_db.RegisterMessage(IPsecRekeyReq)

IPsecRekeyResp = _reflection.GeneratedProtocolMessageType('IPsecRekeyResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECREKEYRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecRekeyResp)
  })
_sym_db.RegisterMessage(IPsecRekeyResp)

IPsecListSasReq = _reflection.GeneratedProtocolMessageType('IPsecListSasReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTSASREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListSasReq)
  })
_sym_db.RegisterMessage(IPsecListSasReq)

ListChildSa = _reflection.GeneratedProtocolMessageType('ListChildSa', (_message.Message,), {
  'DESCRIPTOR' : _LISTCHILDSA,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListChildSa)
  })
_sym_db.RegisterMessage(ListChildSa)

ListIkeSa = _reflection.GeneratedProtocolMessageType('ListIkeSa', (_message.Message,), {
  'DESCRIPTOR' : _LISTIKESA,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListIkeSa)
  })
_sym_db.RegisterMessage(ListIkeSa)

IPsecListSasResp = _reflection.GeneratedProtocolMessageType('IPsecListSasResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTSASRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListSasResp)
  })
_sym_db.RegisterMessage(IPsecListSasResp)

IPsecListConnsReq = _reflection.GeneratedProtocolMessageType('IPsecListConnsReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTCONNSREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListConnsReq)
  })
_sym_db.RegisterMessage(IPsecListConnsReq)

ListConnAuth = _reflection.GeneratedProtocolMessageType('ListConnAuth', (_message.Message,), {
  'DESCRIPTOR' : _LISTCONNAUTH,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListConnAuth)
  })
_sym_db.RegisterMessage(ListConnAuth)

ListChild = _reflection.GeneratedProtocolMessageType('ListChild', (_message.Message,), {
  'DESCRIPTOR' : _LISTCHILD,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListChild)
  })
_sym_db.RegisterMessage(ListChild)

ListConnResp = _reflection.GeneratedProtocolMessageType('ListConnResp', (_message.Message,), {
  'DESCRIPTOR' : _LISTCONNRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListConnResp)
  })
_sym_db.RegisterMessage(ListConnResp)

IPsecListConnsResp = _reflection.GeneratedProtocolMessageType('IPsecListConnsResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTCONNSRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListConnsResp)
  })
_sym_db.RegisterMessage(IPsecListConnsResp)

IPsecListCertsReq = _reflection.GeneratedProtocolMessageType('IPsecListCertsReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTCERTSREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListCertsReq)
  })
_sym_db.RegisterMessage(IPsecListCertsReq)

ListCert = _reflection.GeneratedProtocolMessageType('ListCert', (_message.Message,), {
  'DESCRIPTOR' : _LISTCERT,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.ListCert)
  })
_sym_db.RegisterMessage(ListCert)

IPsecListCertsResp = _reflection.GeneratedProtocolMessageType('IPsecListCertsResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLISTCERTSRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecListCertsResp)
  })
_sym_db.RegisterMessage(IPsecListCertsResp)

IPsecLoadConnReq = _reflection.GeneratedProtocolMessageType('IPsecLoadConnReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLOADCONNREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecLoadConnReq)
  })
_sym_db.RegisterMessage(IPsecLoadConnReq)

IPsecLoadConnResp = _reflection.GeneratedProtocolMessageType('IPsecLoadConnResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECLOADCONNRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecLoadConnResp)
  })
_sym_db.RegisterMessage(IPsecLoadConnResp)

IPsecUnloadConnReq = _reflection.GeneratedProtocolMessageType('IPsecUnloadConnReq', (_message.Message,), {
  'DESCRIPTOR' : _IPSECUNLOADCONNREQ,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecUnloadConnReq)
  })
_sym_db.RegisterMessage(IPsecUnloadConnReq)

IPsecUnloadConnResp = _reflection.GeneratedProtocolMessageType('IPsecUnloadConnResp', (_message.Message,), {
  'DESCRIPTOR' : _IPSECUNLOADCONNRESP,
  '__module__' : 'ipsec_pb2'
  # @@protoc_insertion_point(class_scope:opi_api.security.v1.IPsecUnloadConnResp)
  })
_sym_db.RegisterMessage(IPsecUnloadConnResp)

_IPSEC = DESCRIPTOR.services_by_name['IPsec']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z)github.com/opiproject/opi-api/security/v1'
  _CRYPTOALGORITHM._serialized_start=5986
  _CRYPTOALGORITHM._serialized_end=6124
  _INTEGALGORITHM._serialized_start=6127
  _INTEGALGORITHM._serialized_end=6256
  _DIFFIEHELLMANGROUPS._serialized_start=6259
  _DIFFIEHELLMANGROUPS._serialized_end=6480
  _PSEUDORANDOMFUNCTION._serialized_start=6483
  _PSEUDORANDOMFUNCTION._serialized_end=6621
  _IPSECMODE._serialized_start=6623
  _IPSECMODE._serialized_end=6671
  _AUTHTYPE._serialized_start=6673
  _AUTHTYPE._serialized_end=6724
  _IKESASTATE._serialized_start=6727
  _IKESASTATE._serialized_end=6855
  _CHILDSASTATE._serialized_start=6858
  _CHILDSASTATE._serialized_end=7092
  _CERTIFICATETYPE._serialized_start=7094
  _CERTIFICATETYPE._serialized_end=7204
  _X509CERTIFICATEFLAG._serialized_start=7206
  _X509CERTIFICATEFLAG._serialized_end=7323
  _PROPOSALS._serialized_start=37
  _PROPOSALS._serialized_end=278
  _VIPS._serialized_start=280
  _VIPS._serialized_end=299
  _POOLS._serialized_start=301
  _POOLS._serialized_end=322
  _CERTS._serialized_start=324
  _CERTS._serialized_end=345
  _PUBKEYS._serialized_start=347
  _PUBKEYS._serialized_end=372
  _GROUPS._serialized_start=374
  _GROUPS._serialized_end=397
  _CERTPOLICY._serialized_start=399
  _CERTPOLICY._serialized_end=432
  _CACERTS._serialized_start=434
  _CACERTS._serialized_end=459
  _LOCALAUTH._serialized_start=462
  _LOCALAUTH._serialized_end=670
  _REMOTEAUTH._serialized_start=673
  _REMOTEAUTH._serialized_end=995
  _TRAFFICSELECTORS._serialized_start=998
  _TRAFFICSELECTORS._serialized_end=1145
  _TRAFFICSELECTORS_TRAFFICSELECTOR._serialized_start=1085
  _TRAFFICSELECTORS_TRAFFICSELECTOR._serialized_end=1145
  _ADDRS._serialized_start=1147
  _ADDRS._serialized_end=1168
  _CHILD._serialized_start=1171
  _CHILD._serialized_end=1628
  _CONNECTION._serialized_start=1631
  _CONNECTION._serialized_end=2227
  _UUID._serialized_start=2229
  _UUID._serialized_end=2250
  _IPSECVERSIONREQ._serialized_start=2252
  _IPSECVERSIONREQ._serialized_end=2269
  _IPSECVERSIONRESP._serialized_start=2271
  _IPSECVERSIONRESP._serialized_end=2373
  _IPSECSTATSREQ._serialized_start=2375
  _IPSECSTATSREQ._serialized_end=2390
  _IPSECSTATSRESP._serialized_start=2392
  _IPSECSTATSRESP._serialized_end=2424
  _IPSECINITIATEREQ._serialized_start=2426
  _IPSECINITIATEREQ._serialized_end=2507
  _IPSECINITIATERESP._serialized_start=2509
  _IPSECINITIATERESP._serialized_end=2528
  _IPSECTERMINATEREQ._serialized_start=2531
  _IPSECTERMINATEREQ._serialized_end=2662
  _IPSECTERMINATERESP._serialized_start=2664
  _IPSECTERMINATERESP._serialized_end=2738
  _IPSECREKEYREQ._serialized_start=2740
  _IPSECREKEYREQ._serialized_end=2833
  _IPSECREKEYRESP._serialized_start=2835
  _IPSECREKEYRESP._serialized_end=2885
  _IPSECLISTSASREQ._serialized_start=2887
  _IPSECLISTSASREQ._serialized_end=2983
  _LISTCHILDSA._serialized_start=2986
  _LISTCHILDSA._serialized_end=3342
  _LISTIKESA._serialized_start=3345
  _LISTIKESA._serialized_end=4151
  _IPSECLISTSASRESP._serialized_start=4153
  _IPSECLISTSASRESP._serialized_end=4219
  _IPSECLISTCONNSREQ._serialized_start=4221
  _IPSECLISTCONNSREQ._serialized_end=4253
  _LISTCONNAUTH._serialized_start=4256
  _LISTCONNAUTH._serialized_end=4621
  _LISTCHILD._serialized_start=4624
  _LISTCHILD._serialized_end=4936
  _LISTCONNRESP._serialized_start=4939
  _LISTCONNRESP._serialized_end=5376
  _IPSECLISTCONNSRESP._serialized_start=5378
  _IPSECLISTCONNSRESP._serialized_end=5453
  _IPSECLISTCERTSREQ._serialized_start=5455
  _IPSECLISTCERTSREQ._serialized_end=5519
  _LISTCERT._serialized_start=5522
  _LISTCERT._serialized_end=5728
  _IPSECLISTCERTSRESP._serialized_start=5730
  _IPSECLISTCERTSRESP._serialized_end=5796
  _IPSECLOADCONNREQ._serialized_start=5798
  _IPSECLOADCONNREQ._serialized_end=5869
  _IPSECLOADCONNRESP._serialized_start=5871
  _IPSECLOADCONNRESP._serialized_end=5907
  _IPSECUNLOADCONNREQ._serialized_start=5909
  _IPSECUNLOADCONNREQ._serialized_end=5943
  _IPSECUNLOADCONNRESP._serialized_start=5945
  _IPSECUNLOADCONNRESP._serialized_end=5983
  _IPSEC._serialized_start=7326
  _IPSEC._serialized_end=8304
# @@protoc_insertion_point(module_scope)