import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

public class Process {
    public static void main(String[] args) {
        RuntimeMXBean bean = ManagementFactory.getRuntimeMXBean();

        String jvmName = bean.getName();
        System.out.println("Nombre = " + jvmName);

        long pid = Long.valueOf(jvmName.split("@")[0]);
        System.out.println("PID  = " + pid);
    }
}