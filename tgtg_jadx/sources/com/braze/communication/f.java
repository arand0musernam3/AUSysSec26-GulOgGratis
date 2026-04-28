package com.braze.communication;

import com.braze.support.BrazeLogger;
import i90.j;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends SSLSocketFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f9635a;

    public f() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f9635a = sSLContext.getSocketFactory();
    }

    public final Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ArrayList arrayList = new ArrayList();
            SSLSocket sSLSocket = (SSLSocket) socket;
            Iterator it = ArrayIteratorKt.iterator(sSLSocket.getSupportedProtocols());
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!Intrinsics.areEqual(str, "SSLv3")) {
                    str.getClass();
                    arrayList.add(str);
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new j(4, arrayList), 6, (Object) null);
            sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i11, boolean z11) throws IOException {
        socket.getClass();
        str.getClass();
        Socket socketCreateSocket = this.f9635a.createSocket(socket, str, i11, z11);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        String[] defaultCipherSuites = this.f9635a.getDefaultCipherSuites();
        defaultCipherSuites.getClass();
        return defaultCipherSuites;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        String[] supportedCipherSuites = this.f9635a.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        return supportedCipherSuites;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        Socket socketCreateSocket = this.f9635a.createSocket();
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11) throws IOException {
        str.getClass();
        Socket socketCreateSocket = this.f9635a.createSocket(str, i11);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) throws IOException {
        str.getClass();
        inetAddress.getClass();
        Socket socketCreateSocket = this.f9635a.createSocket(str, i11, inetAddress, i12);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11) throws IOException {
        inetAddress.getClass();
        Socket socketCreateSocket = this.f9635a.createSocket(inetAddress, i11);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) throws IOException {
        inetAddress.getClass();
        inetAddress2.getClass();
        Socket socketCreateSocket = this.f9635a.createSocket(inetAddress, i11, inetAddress2, i12);
        socketCreateSocket.getClass();
        return a(socketCreateSocket);
    }

    public static final String a(List list) {
        return "Enabling SSL protocols: " + list;
    }
}
