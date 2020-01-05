package cms5;

public class cms5 {
public static void main(String[] args) {
	System.out.println("helloWord123");
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------< com.asdf:asdf-senior1-week2 >---------------------
[INFO] Building asdf-senior1-week2 0.0.1-SNAPSHOT
[INFO] --------------------------------[ war ]---------------------------------
Exception in thread "Thread-2" java.lang.NoClassDefFoundError: org/eclipse/jetty/io/ManagedSelector$CloseEndPoints
	at org.eclipse.jetty.io.ManagedSelector.doStop(ManagedSelector.java:135)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.stop(ContainerLifeCycle.java:142)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStop(ContainerLifeCycle.java:160)
	at org.eclipse.jetty.io.SelectorManager.doStop(SelectorManager.java:257)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.stop(ContainerLifeCycle.java:142)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStop(ContainerLifeCycle.java:160)
	at org.eclipse.jetty.client.AbstractHttpClientTransport.doStop(AbstractHttpClientTransport.java:87)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.stop(ContainerLifeCycle.java:142)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStop(ContainerLifeCycle.java:160)
	at org.eclipse.jetty.client.HttpClient.doStop(HttpClient.java:254)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.stop(ContainerLifeCycle.java:142)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStop(ContainerLifeCycle.java:160)
	at org.eclipse.jetty.websocket.client.WebSocketClient.doStop(WebSocketClient.java:376)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.stop(ContainerLifeCycle.java:142)
	at org.eclipse.jetty.util.component.ContainerLifeCycle.doStop(ContainerLifeCycle.java:160)
	at org.eclipse.jetty.websocket.jsr356.ClientContainer.doStop(ClientContainer.java:214)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.stop(AbstractLifeCycle.java:89)
	at org.eclipse.jetty.util.thread.ShutdownThread.run(ShutdownThread.java:138)
Caused by: java.lang.ClassNotFoundException: org.eclipse.jetty.io.ManagedSelector$CloseEndPoints
	at org.codehaus.plexus.classworlds.strategy.SelfFirstStrategy.loadClass(SelfFirstStrategy.java:50)
	at org.codehaus.plexus.classworlds.realm.ClassRealm.unsynchronizedLoadClass(ClassRealm.java:271)
	at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:247)
	at org.codehaus.plexus.classworlds.realm.ClassRealm.loadClass(ClassRealm.java:239)
	... 23 more
}
}
