package mcl_RF_Switch_Controller64;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import mcl_RF_Switch_Controller64.*;

public class USB_RF_SwitchBox {
  protected NObject javonetHandle;

  public USB_RF_SwitchBox() {
    try {
      javonetHandle = Javonet.New("mcl_RF_Switch_Controller64.USB_RF_SwitchBox");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public USB_RF_SwitchBox(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Connect(AtomicReference<java.lang.String> SN) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Connect", new NRef(SN));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ConnectByAddress(AtomicReference<java.lang.Integer> Address) {
    try {
      java.lang.Integer res = javonetHandle.invoke("ConnectByAddress", new NRef(Address));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_Address() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_Address");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte Set_Address(AtomicReference<java.lang.Integer> Address) {
    try {
      java.lang.Byte res = javonetHandle.invoke("Set_Address", new NRef(Address));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_Available_Address_List(AtomicReference<java.lang.String> Add_List) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("Get_Available_Address_List", new NRef(Add_List));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Read_ModelName(AtomicReference<java.lang.String> ModelName) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Read_ModelName", new NRef(ModelName));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetSwitchesStatus(AtomicReference<java.lang.Integer> StatusRet) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetSwitchesStatus", new NRef(StatusRet));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_2SP4T_State(java.lang.String sw) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_2SP4T_State", sw);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_2SP4T_COM_To(java.lang.Integer P1, java.lang.Integer P2) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_2SP4T_COM_To", P1, P2);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_2SP4T_COMA_To(java.lang.Integer p) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_2SP4T_COMA_To", p);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_2SP4T_COMB_To(java.lang.Integer p) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_2SP4T_COMB_To", p);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetAllSwitchCounters(AtomicReference<java.lang.Long[]> swc) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetAllSwitchCounters", new NRef(swc));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long GetSwitchCounter(java.lang.String sw) {
    try {
      java.lang.Long res = javonetHandle.invoke("GetSwitchCounter", sw);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_2x10(java.lang.Integer P1, java.lang.Integer P2) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_2x10", P1, P2);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetFirmware() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetFirmware");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetUSBConnectionStatus() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetUSBConnectionStatus");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_24V_Indicator() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_24V_Indicator");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_FAN_Indicator() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_FAN_Indicator");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Get_Available_SN_List(AtomicReference<java.lang.String> SN_List) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Get_Available_SN_List", new NRef(SN_List));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_Switch(
      AtomicReference<java.lang.String> SwitchName, AtomicReference<java.lang.Integer> Val) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke("Set_Switch", new NRef(SwitchName), new NRef(Val));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_2x10(java.lang.Integer P1, java.lang.Integer P2) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_2x10", P1, P2);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_SP4T_COM_To(java.lang.Integer p) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_SP4T_COM_To", p);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Set_SwitchesPort(AtomicReference<java.lang.Byte> Val) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Set_SwitchesPort", new NRef(Val));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Float GetDeviceTemperature(AtomicReference<java.lang.Integer> TSensor) {
    try {
      java.lang.Float res = javonetHandle.invoke("GetDeviceTemperature", new NRef(TSensor));
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHeatAlarm() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHeatAlarm");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Read_SN(AtomicReference<java.lang.String> SN) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Read_SN", new NRef(SN));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Disconnect() {
    try {
      javonetHandle.invoke("Disconnect");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer Check_Connection() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Check_Connection");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetConnectionStatus() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetConnectionStatus");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetExtFirmware(
      AtomicReference<java.lang.Integer> a0,
      AtomicReference<java.lang.Integer> a1,
      AtomicReference<java.lang.Integer> a2,
      AtomicReference<java.lang.Integer> a3,
      AtomicReference<java.lang.String> DocFirmware) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetExtFirmware",
              new NRef(a0),
              new NRef(a1),
              new NRef(a2),
              new NRef(a3),
              new NRef(DocFirmware));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_CurrentConfig(
      AtomicReference<java.lang.Integer> ip1,
      AtomicReference<java.lang.Integer> ip2,
      AtomicReference<java.lang.Integer> ip3,
      AtomicReference<java.lang.Integer> ip4,
      AtomicReference<java.lang.Integer> mask1,
      AtomicReference<java.lang.Integer> mask2,
      AtomicReference<java.lang.Integer> mask3,
      AtomicReference<java.lang.Integer> mask4,
      AtomicReference<java.lang.Integer> Gateway1,
      AtomicReference<java.lang.Integer> Gateway2,
      AtomicReference<java.lang.Integer> Gateway3,
      AtomicReference<java.lang.Integer> Gateway4) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetEthernet_CurrentConfig",
              new NRef(ip1),
              new NRef(ip2),
              new NRef(ip3),
              new NRef(ip4),
              new NRef(mask1),
              new NRef(mask2),
              new NRef(mask3),
              new NRef(mask4),
              new NRef(Gateway1),
              new NRef(Gateway2),
              new NRef(Gateway3),
              new NRef(Gateway4));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_IPAddress(
      AtomicReference<java.lang.Integer> b1,
      AtomicReference<java.lang.Integer> b2,
      AtomicReference<java.lang.Integer> b3,
      AtomicReference<java.lang.Integer> b4) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetEthernet_IPAddress", new NRef(b1), new NRef(b2), new NRef(b3), new NRef(b4));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_MACAddress(
      AtomicReference<java.lang.Integer> MAC1,
      AtomicReference<java.lang.Integer> MAC2,
      AtomicReference<java.lang.Integer> MAC3,
      AtomicReference<java.lang.Integer> MAC4,
      AtomicReference<java.lang.Integer> MAC5,
      AtomicReference<java.lang.Integer> MAC6) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetEthernet_MACAddress",
              new NRef(MAC1),
              new NRef(MAC2),
              new NRef(MAC3),
              new NRef(MAC4),
              new NRef(MAC5),
              new NRef(MAC6));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_NetworkGateway(
      AtomicReference<java.lang.Integer> b1,
      AtomicReference<java.lang.Integer> b2,
      AtomicReference<java.lang.Integer> b3,
      AtomicReference<java.lang.Integer> b4) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetEthernet_NetworkGateway", new NRef(b1), new NRef(b2), new NRef(b3), new NRef(b4));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_PWD(AtomicReference<java.lang.String> Pwd) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetEthernet_PWD", new NRef(Pwd));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_SubNetMask(
      AtomicReference<java.lang.Integer> b1,
      AtomicReference<java.lang.Integer> b2,
      AtomicReference<java.lang.Integer> b3,
      AtomicReference<java.lang.Integer> b4) {
    try {
      java.lang.Integer res =
          javonetHandle.invoke(
              "GetEthernet_SubNetMask", new NRef(b1), new NRef(b2), new NRef(b3), new NRef(b4));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_TCPIPPort(AtomicReference<java.lang.Integer> P) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetEthernet_TCPIPPort", new NRef(P));
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_UseDHCP() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetEthernet_UseDHCP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetEthernet_UsePWD() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetEthernet_UsePWD");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_IPAddress(
      java.lang.Integer b1, java.lang.Integer b2, java.lang.Integer b3, java.lang.Integer b4) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_IPAddress", b1, b2, b3, b4);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_NetworkGateway(
      java.lang.Integer b1, java.lang.Integer b2, java.lang.Integer b3, java.lang.Integer b4) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_NetworkGateway", b1, b2, b3, b4);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_SubnetMask(
      java.lang.Integer b1, java.lang.Integer b2, java.lang.Integer b3, java.lang.Integer b4) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_SubnetMask", b1, b2, b3, b4);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_PWD(java.lang.String Pwd) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_PWD", Pwd);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_TCPIPPort(java.lang.Integer P) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_TCPIPPort", P);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_UseDHCP(java.lang.Integer UseDHCP) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_UseDHCP", UseDHCP);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer SaveEthernet_UsePWD(java.lang.Integer UsePwd) {
    try {
      java.lang.Integer res = javonetHandle.invoke("SaveEthernet_UsePWD", UsePwd);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetUSBDeviceName() {
    try {
      java.lang.String res = javonetHandle.invoke("GetUSBDeviceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Short GetStatus() {
    try {
      java.lang.Short res = javonetHandle.invoke("GetStatus");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
