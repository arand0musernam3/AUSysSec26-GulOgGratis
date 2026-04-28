package se;

import a40.e0;
import a40.m;
import a8.h;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import bx.x;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.app.tgtg.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import d10.o;
import e10.f;
import i4.l0;
import i40.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import kotlin.Pair;
import lz.i;
import mv.z;
import o.j;
import o.l;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.json.JSONObject;
import pg.a2;
import qz.q;
import r8.g;
import s0.i1;
import s0.l1;
import s0.n2;
import s0.o2;
import s0.q2;
import s0.r1;
import w.a0;
import yi.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.google.android.material.button.c, q, v, n2, j, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f39010b;

    public b(int i11) {
        this.f39009a = i11;
        switch (i11) {
            case 8:
                break;
            case 13:
                this.f39010b = new o();
                break;
            case 14:
                this.f39010b = new AtomicInteger(0);
                break;
            case 23:
                this.f39010b = new HashSet();
                break;
            case 27:
                i iVar = new i(21, false);
                iVar.f28446b = new i50.a(134, 0.75f, true);
                this.f39010b = iVar;
                break;
            default:
                this.f39010b = new HashMap();
                break;
        }
    }

    public static void e(h hVar, e eVar) {
        String str = eVar.f23347a;
        if (str != null) {
            hVar.r("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        hVar.r("X-CRASHLYTICS-API-CLIENT-TYPE", AnalyticsPlatformParams.channel);
        hVar.r("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.4");
        hVar.r("Accept", "application/json");
        hVar.r("X-CRASHLYTICS-DEVICE-MODEL", eVar.f23348b);
        String str2 = eVar.f23349c;
        if (str2 != null) {
            hVar.r("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = eVar.f23350d;
        if (str3 != null) {
            hVar.r("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = eVar.f23351e.c().f711a;
        if (str4 != null) {
            hVar.r("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static String g(String str, a aVar, boolean z11) {
        String str2 = z11 ? ".temp" + aVar.extension : aVar.extension;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b8 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b8)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return a0.p("lottie_cache_", strReplaceAll, str2);
    }

    public static HashMap n(e eVar) {
        HashMap map = new HashMap();
        map.put("build_version", eVar.f23354h);
        map.put("display_version", eVar.f23353g);
        map.put("source", Integer.toString(eVar.f23355i));
        String str = eVar.f23352f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // r8.g
    public long a(float f11, float f12) {
        long jB = l0.b((((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32), (float[]) this.f39010b);
        return q1.h.a(Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)));
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        int i11 = 0;
        switch (this.f39009a) {
            case 12:
                c00.b bVar = (c00.b) this.f39010b;
                d00.d dVar = (d00.d) obj;
                d00.e eVar = new d00.e(0, (d10.g) obj2);
                d00.c cVar = (d00.c) dVar.getService();
                dVar.getContext();
                com.google.android.gms.common.api.i iVarA = l00.b.a();
                d00.a aVar = (d00.a) cVar;
                aVar.getClass();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = l00.a.f26750a;
                parcelObtain.writeStrongBinder(eVar);
                l00.a.b(parcelObtain, bVar);
                l00.a.b(parcelObtain, iVarA);
                aVar.a(9, parcelObtain);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                r00.i iVar = (r00.i) obj;
                f fVar = (f) this.f39010b;
                iVar.getClass();
                r00.h hVar = new r00.h(i11, (d10.g) obj2);
                try {
                    r00.g gVar = (r00.g) iVar.getService();
                    Bundle bundleB = iVar.b();
                    gVar.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken(gVar.f11628i);
                    r00.a.c(parcelObtain2, fVar);
                    r00.a.c(parcelObtain2, bundleB);
                    r00.a.d(parcelObtain2, hVar);
                    gVar.M(14, parcelObtain2);
                } catch (RemoteException e5) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e5);
                    Bundle bundle = Bundle.EMPTY;
                    na0.a.w0(Status.f11056g, Boolean.FALSE, hVar.f37521i);
                    return;
                }
                break;
            default:
                f00.a aVar2 = new f00.a(0, (d10.g) obj2);
                f00.j jVar = (f00.j) ((f00.d) obj).getService();
                jz.e eVar2 = (jz.e) this.f39010b;
                Parcel parcelA = jVar.a();
                int i13 = f00.g.f17037a;
                parcelA.writeStrongBinder(aVar2);
                f00.g.c(parcelA, eVar2);
                jVar.b(1, parcelA);
                break;
        }
    }

    @Override // yi.v
    public void b() {
        ((a2) this.f39010b).f34775x.setEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: all -> 0x0050, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001a, B:12:0x001e, B:14:0x0024, B:16:0x0036, B:17:0x0040, B:19:0x0046, B:10:0x0017, B:7:0x000b), top: B:27:0x0001, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(bx.w r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.Set r0 = yx.a.f46339a     // Catch: java.lang.Throwable -> L50
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Throwable -> L50
            r1 = 0
            if (r0 == 0) goto Lb
            goto L1a
        Lb:
            java.util.HashMap r0 = r4.f6753a     // Catch: java.lang.Throwable -> L16
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L16
            r1 = r0
            goto L1a
        L16:
            r0 = move-exception
            yx.a.a(r4, r0)     // Catch: java.lang.Throwable -> L50
        L1a:
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L50
        L1e:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L52
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L50
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L50
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L50
            bx.b r1 = (bx.b) r1     // Catch: java.lang.Throwable -> L50
            bx.x r1 = r3.o(r1)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L1e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L50
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50
        L40:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L50
            bx.g r2 = (bx.g) r2     // Catch: java.lang.Throwable -> L50
            r1.a(r2)     // Catch: java.lang.Throwable -> L50
            goto L40
        L50:
            r4 = move-exception
            goto L54
        L52:
            monitor-exit(r3)
            return
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L50
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.c(bx.w):void");
    }

    @Override // m0.d0
    public i1 d() {
        return (i1) this.f39010b;
    }

    @Override // s0.n2
    public o2 f() {
        return new g1.e(l1.e((i1) this.f39010b));
    }

    public File h(String str) {
        File file = new File(u(), g(str, a.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(u(), g(str, a.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(u(), g(str, a.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public synchronized int i() {
        int i11;
        int size;
        i11 = 0;
        for (x xVar : ((HashMap) this.f39010b).values()) {
            synchronized (xVar) {
                if (!yx.a.f46339a.contains(xVar)) {
                    try {
                        size = xVar.f6756c.size();
                    } catch (Throwable th2) {
                        yx.a.a(xVar, th2);
                        size = 0;
                    }
                }
                size = 0;
            }
            i11 += size;
        }
        return i11;
    }

    @Override // o.j
    public boolean j(l lVar, MenuItem menuItem) {
        p10.e eVar = (p10.e) this.f39010b;
        if (eVar.f21357f != null && menuItem.getItemId() == eVar.getSelectedItemId()) {
            eVar.f21357f.getClass();
            return true;
        }
        h20.q qVar = eVar.f21356e;
        if (qVar == null) {
            return false;
        }
        bo.e eVar2 = (bo.e) qVar;
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        z zVar = itemId == R.id.item_discover ? z.DISCOVER : itemId == R.id.item_browse ? z.BROWSE : itemId == R.id.item_manufacturer ? z.MANUFACTURER : itemId == R.id.item_favourites ? z.FAVORITES : itemId == R.id.item_profile ? z.PROFILE : itemId == R.id.item_my_store ? z.MY_STORE : itemId == R.id.item_my_store_more ? z.MY_STORE_MORE : null;
        if (zVar == null) {
            return false;
        }
        eVar2.f6550a.invoke(zVar);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.u1
            if (r0 == 0) goto L13
            r0 = r6
            ao.u1 r0 = (ao.u1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.u1 r0 = new ao.u1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4464j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f39010b
            kt.h r6 = (kt.h) r6
            r0.l = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.k(java.lang.String, z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(com.app.tgtg.model.remote.mapService.request.LocationRequest r5, z70.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ao.v1
            if (r0 == 0) goto L13
            r0 = r6
            ao.v1 r0 = (ao.v1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ao.v1 r0 = new ao.v1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4475j
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r5 = r6.f40851a
            return r5
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L32:
            ba0.g.M(r6)
            java.lang.Object r6 = r4.f39010b
            kt.h r6 = (kt.h) r6
            r0.l = r3
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: se.b.l(com.app.tgtg.model.remote.mapService.request.LocationRequest, z70.c):java.lang.Object");
    }

    public Pattern m(String str) {
        Object obj;
        i iVar = (i) this.f39010b;
        synchronized (iVar) {
            obj = ((i50.a) iVar.f28446b).get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern != null) {
            return pattern;
        }
        Pattern patternCompile = Pattern.compile(str);
        i iVar2 = (i) this.f39010b;
        synchronized (iVar2) {
            ((i50.a) iVar2.f28446b).put(str, patternCompile);
        }
        return patternCompile;
    }

    public synchronized x o(bx.b bVar) {
        Context contextA;
        tx.c cVarA;
        x xVar = (x) ((HashMap) this.f39010b).get(bVar);
        if (xVar == null && (cVarA = tx.j.a((contextA = ax.a0.a()))) != null) {
            xVar = new x(cVarA, f0.z(contextA));
        }
        if (xVar == null) {
            return null;
        }
        ((HashMap) this.f39010b).put(bVar, xVar);
        return xVar;
    }

    public JSONObject p(androidx.constraintlayout.widget.z zVar) {
        String str = (String) this.f39010b;
        int i11 = zVar.f2542b;
        x30.b bVar = x30.b.f43820a;
        bVar.c("Settings response code was: " + i11);
        if (i11 == 200 || i11 == 201 || i11 == 202 || i11 == 203) {
            String str2 = (String) zVar.f2543c;
            try {
                return new JSONObject(str2);
            } catch (Exception e5) {
                bVar.d("Failed to parse settings JSON from ".concat(str), e5);
                bVar.d("Settings response " + str2, null);
                return null;
            }
        }
        String str3 = "Settings request failed; (status: " + i11 + ") from " + str;
        if (bVar.a(6)) {
            Log.e("FirebaseCrashlytics", str3, null);
        }
        return null;
    }

    public synchronized Set r() {
        Set setKeySet;
        setKeySet = ((HashMap) this.f39010b).keySet();
        setKeySet.getClass();
        return setKeySet;
    }

    public void s(View view, int i11, boolean z11) {
        if (Build.VERSION.SDK_INT >= 27) {
            c4.i.a(view, (AutofillManager) this.f39010b, i11, z11);
        }
    }

    public void t(cz.j jVar, Thread thread, Throwable th2) {
        Task taskJ;
        a40.o oVar = (a40.o) this.f39010b;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            dx.f.v();
            long jCurrentTimeMillis = System.currentTimeMillis();
            b40.c cVar = oVar.f751e.f5742a;
            m mVar = new m(oVar, jCurrentTimeMillis, th2, thread, jVar);
            synchronized (cVar.f5738b) {
                taskJ = cVar.f5739c.j(cVar.f5737a, new w.z(mVar, 13));
                cVar.f5739c = taskJ;
            }
            try {
                e0.a(taskJ);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e5) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e5);
            }
        }
    }

    public File u() {
        File file = new File(((he.d) this.f39010b).f21872a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void v(String str, String str2) {
        str.getClass();
        dv.b bVarE = h0.g.E(new Pair(dv.a.SOURCE, new dv.c(str)));
        if (str2 != null) {
            bVarE.b(dv.a.ORDER_ID, str2);
        }
        ((cv.b) this.f39010b).c(cv.i.ACTION_OPEN_CHAT_WIDGET, bVarE);
    }

    public File w(String str, InputStream inputStream, a aVar) throws IOException {
        File file = new File(u(), g(str, aVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i11 = inputStream.read(bArr);
                    if (i11 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i11);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // o.j
    public void q(l lVar) {
    }

    public /* synthetic */ b(Object obj, int i11) {
        this.f39009a = i11;
        this.f39010b = obj;
    }

    public b(xg.x xVar) {
        this.f39009a = 4;
        xVar.getClass();
        this.f39010b = xVar;
    }

    public b(kt.h hVar) {
        this.f39009a = 6;
        hVar.getClass();
        this.f39010b = hVar;
    }

    public b(cv.b bVar) {
        this.f39009a = 28;
        bVar.getClass();
        this.f39010b = bVar;
    }

    public /* synthetic */ b(f00.c cVar, jz.e eVar) {
        this.f39009a = 18;
        this.f39010b = eVar;
    }

    public b(r1 r1Var) {
        this.f39009a = 1;
        this.f39010b = (IncorrectJpegMetadataQuirk) r1Var.b(IncorrectJpegMetadataQuirk.class);
    }

    public b(i1 i1Var) {
        this.f39009a = 21;
        this.f39010b = i1Var;
        s0.g gVar = y0.i.f44570e1;
        Class cls = (Class) i1Var.i(gVar, null);
        if (cls != null && !cls.equals(g1.d.class)) {
            m0.i1.k("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        i1Var.v(o2.U0, q2.STREAM_SHARING);
        i1Var.v(gVar, g1.d.class);
        s0.g gVar2 = y0.i.f44569d1;
        if (i1Var.i(gVar2, null) == null) {
            i1Var.v(gVar2, g1.d.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public b(String str, n20.f fVar) {
        this.f39009a = 26;
        this.f39010b = str;
    }
}
