package a3;

import a3.i3;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import y00.i4;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i3 implements o, s0.f1, qz.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f396c;

    public i3(int i11) {
        switch (i11) {
            case 5:
                this.f395b = null;
                this.f396c = null;
                this.f394a = true;
                break;
            default:
                this.f395b = new Object();
                break;
        }
    }

    public static int o(ArrayList arrayList, int i11, zw.n1 n1Var) {
        int i12 = 0;
        if (i11 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i11);
        zw.l1 l1Var = n1Var.f48324b;
        if (obj != l1Var) {
            return -1;
        }
        Iterator it = l1Var.getChildren().iterator();
        while (it.hasNext()) {
            if (((zw.p1) it.next()) == n1Var) {
                return i12;
            }
            i12++;
        }
        return -1;
    }

    public static ArrayList r(zw.e eVar) {
        ArrayList arrayList = new ArrayList();
        while (!eVar.n()) {
            String str = (String) eVar.f30157e;
            String strSubstring = null;
            if (!eVar.n()) {
                int i11 = eVar.f30154b;
                char cCharAt = str.charAt(i11);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    eVar.f30154b = i11;
                } else {
                    int iG = eVar.g();
                    while (true) {
                        if ((iG < 65 || iG > 90) && (iG < 97 || iG > 122)) {
                            break;
                        }
                        iG = eVar.g();
                    }
                    strSubstring = str.substring(i11, eVar.f30154b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(zw.g.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!eVar.J()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean u(zw.p pVar, int i11, ArrayList arrayList, int i12, zw.n1 n1Var) {
        zw.q qVar = (zw.q) pVar.f48319a.get(i11);
        if (!x(qVar, n1Var)) {
            return false;
        }
        zw.f fVar = qVar.f48327a;
        if (fVar == zw.f.DESCENDANT) {
            if (i11 != 0) {
                while (i12 >= 0) {
                    if (!w(pVar, i11 - 1, arrayList, i12)) {
                        i12--;
                    }
                }
                return false;
            }
            return true;
        }
        if (fVar == zw.f.CHILD) {
            return w(pVar, i11 - 1, arrayList, i12);
        }
        int iO = o(arrayList, i12, n1Var);
        if (iO <= 0) {
            return false;
        }
        return u(pVar, i11 - 1, arrayList, i12, (zw.n1) n1Var.f48324b.getChildren().get(iO - 1));
    }

    public static boolean v(zw.p pVar, zw.n1 n1Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = n1Var.f48324b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((zw.p1) obj).f48324b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = pVar.f48319a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = pVar.f48319a;
        if (size2 == 1) {
            return x((zw.q) arrayList3.get(0), n1Var);
        }
        return u(pVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, n1Var);
    }

    public static boolean w(zw.p pVar, int i11, ArrayList arrayList, int i12) {
        zw.q qVar = (zw.q) pVar.f48319a.get(i11);
        zw.n1 n1Var = (zw.n1) arrayList.get(i12);
        if (!x(qVar, n1Var)) {
            return false;
        }
        zw.f fVar = qVar.f48327a;
        if (fVar == zw.f.DESCENDANT) {
            if (i11 != 0) {
                while (i12 > 0) {
                    i12--;
                    if (w(pVar, i11 - 1, arrayList, i12)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (fVar == zw.f.CHILD) {
            return w(pVar, i11 - 1, arrayList, i12 - 1);
        }
        int iO = o(arrayList, i12, n1Var);
        if (iO <= 0) {
            return false;
        }
        return u(pVar, i11 - 1, arrayList, i12, (zw.n1) n1Var.f48324b.getChildren().get(iO - 1));
    }

    public static boolean x(zw.q qVar, zw.n1 n1Var) {
        ArrayList arrayList;
        String str = qVar.f48328b;
        if (str != null && !str.equals(n1Var.n().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<zw.c> arrayList2 = qVar.f48329c;
        if (arrayList2 != null) {
            for (zw.c cVar : arrayList2) {
                String str2 = cVar.f48169a;
                String str3 = cVar.f48171c;
                if (str2.equals("id")) {
                    if (!str3.equals(n1Var.f48294c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = n1Var.f48298g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = qVar.f48330d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((zw.h) it.next()).a(n1Var)) {
                return false;
            }
        }
        return true;
    }

    public void A(d10.m mVar) {
        synchronized (this.f395b) {
            try {
                if (((ArrayDeque) this.f396c) == null) {
                    this.f396c = new ArrayDeque();
                }
                ((ArrayDeque) this.f396c).add(mVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void B(Task task) {
        d10.m mVar;
        synchronized (this.f395b) {
            if (((ArrayDeque) this.f396c) != null && !this.f394a) {
                this.f394a = true;
                while (true) {
                    synchronized (this.f395b) {
                        try {
                            mVar = (d10.m) ((ArrayDeque) this.f396c).poll();
                            if (mVar == null) {
                                this.f394a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    mVar.a(task);
                }
            }
        }
    }

    @Override // s0.f1
    public m0.n0 a() {
        Image imageAcquireLatestImage;
        synchronized (this.f396c) {
            try {
                imageAcquireLatestImage = ((ImageReader) this.f395b).acquireLatestImage();
            } catch (RuntimeException e5) {
                if (!"ImageReaderContext is not initialized".equals(e5.getMessage())) {
                    throw e5;
                }
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return null;
            }
            return new m0.a(imageAcquireLatestImage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:11:0x0020, B:13:0x002b, B:14:0x0030, B:18:0x0036, B:20:0x0040, B:23:0x0047, B:25:0x004a, B:28:0x0058, B:31:0x005e, B:33:0x0068, B:36:0x00d4, B:34:0x00ac, B:35:0x00cf), top: B:44:0x0020 }] */
    @Override // qz.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void accept(java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i3.accept(java.lang.Object, java.lang.Object):void");
    }

    @Override // s0.f1
    public int b() {
        int width;
        synchronized (this.f396c) {
            width = ((ImageReader) this.f395b).getWidth();
        }
        return width;
    }

    @Override // s0.f1
    public int c() {
        int imageFormat;
        synchronized (this.f396c) {
            imageFormat = ((ImageReader) this.f395b).getImageFormat();
        }
        return imageFormat;
    }

    @Override // s0.f1
    public void close() {
        synchronized (this.f396c) {
            ((ImageReader) this.f395b).close();
        }
    }

    @Override // a3.o
    public boolean d(long j9) {
        m2.e1 e1Var;
        l3 l3Var = (l3) this.f396c;
        if (!l3Var.k() || l3Var.n().f37714a.f29538b.length() == 0 || (e1Var = l3Var.f451d) == null || e1Var.d() == null) {
            return false;
        }
        y(l3Var.n(), j9, false, k0.f431d);
        return true;
    }

    @Override // s0.f1
    public void e() {
        synchronized (this.f396c) {
            this.f394a = true;
            ((ImageReader) this.f395b).setOnImageAvailableListener(null, null);
        }
    }

    @Override // a3.o
    public void f() {
        if (this.f394a) {
            l3.b((l3) this.f396c, (m5.t0) this.f395b);
        }
    }

    @Override // a3.o
    public boolean g(long j9, j0 j0Var, int i11) {
        m2.e1 e1Var;
        l3 l3Var = (l3) this.f396c;
        if (!l3Var.k() || l3Var.n().f37714a.f29538b.length() == 0 || (e1Var = l3Var.f451d) == null || e1Var.d() == null) {
            return false;
        }
        g4.v vVar = l3Var.f458k;
        if (vVar != null) {
            g4.v.a(vVar);
        }
        l3Var.f460n = j9;
        l3Var.f465s = -1;
        l3Var.h(true);
        long jY = y(l3Var.n(), l3Var.f460n, true, j0Var);
        if (i11 >= 2) {
            this.f394a = true;
            this.f395b = new m5.t0(jY);
        }
        return true;
    }

    @Override // s0.f1
    public int getHeight() {
        int height;
        synchronized (this.f396c) {
            height = ((ImageReader) this.f395b).getHeight();
        }
        return height;
    }

    @Override // s0.f1
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f396c) {
            surface = ((ImageReader) this.f395b).getSurface();
        }
        return surface;
    }

    @Override // a3.o
    public boolean h(long j9, j0 j0Var) {
        m2.e1 e1Var;
        l3 l3Var = (l3) this.f396c;
        if (!l3Var.k() || l3Var.n().f37714a.f29538b.length() == 0 || (e1Var = l3Var.f451d) == null || e1Var.d() == null) {
            return false;
        }
        y(l3Var.n(), j9, false, j0Var);
        return true;
    }

    @Override // s0.f1
    public int i() {
        int maxImages;
        synchronized (this.f396c) {
            maxImages = ((ImageReader) this.f395b).getMaxImages();
        }
        return maxImages;
    }

    @Override // s0.f1
    public m0.n0 j() {
        Image imageAcquireNextImage;
        synchronized (this.f396c) {
            try {
                imageAcquireNextImage = ((ImageReader) this.f395b).acquireNextImage();
            } catch (RuntimeException e5) {
                if (!"ImageReaderContext is not initialized".equals(e5.getMessage())) {
                    throw e5;
                }
                imageAcquireNextImage = null;
            }
            if (imageAcquireNextImage == null) {
                return null;
            }
            return new m0.a(imageAcquireNextImage);
        }
    }

    @Override // s0.f1
    public void k(final s0.e1 e1Var, final Executor executor) {
        Handler handler;
        synchronized (this.f396c) {
            this.f394a = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: m0.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    i3 i3Var = this.f28466a;
                    Executor executor2 = executor;
                    s0.e1 e1Var2 = e1Var;
                    synchronized (i3Var.f396c) {
                        try {
                            if (!i3Var.f394a) {
                                executor2.execute(new com.google.firebase.messaging.r(26, i3Var, e1Var2));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.f395b;
            if (v0.n.f41630a != null) {
                handler = v0.n.f41630a;
            } else {
                synchronized (v0.n.class) {
                    try {
                        if (v0.n.f41630a == null) {
                            v0.n.f41630a = jf.e.p(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
                handler = v0.n.f41630a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // a3.o
    public boolean l(long j9) {
        l3 l3Var = (l3) this.f396c;
        m2.e1 e1Var = l3Var.f451d;
        if (e1Var == null || e1Var.d() == null || !l3Var.k()) {
            return false;
        }
        l3Var.f465s = -1;
        g4.v vVar = l3Var.f458k;
        if (vVar != null) {
            g4.v.a(vVar);
        }
        y(l3Var.n(), j9, false, k0.f431d);
        return true;
    }

    public boolean m(long j9) {
        Object obj;
        List list = (List) ((ub.a) this.f396c).f40981b;
        int size = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i11);
            if (w4.u.e(((w4.x) obj).f43195a, j9)) {
                break;
            }
            i11++;
        }
        w4.x xVar = (w4.x) obj;
        if (xVar != null) {
            return xVar.f43202h;
        }
        return false;
    }

    public i3 n() {
        if (TextUtils.isEmpty((String) this.f395b)) {
            i4.a.f("Title must be set and non-empty.");
            return null;
        }
        if (!a.a.F(0)) {
            throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + String.valueOf(0));
        }
        if (TextUtils.isEmpty((String) this.f396c)) {
            i4.a.f("Negative text must be set and non-empty.");
            return null;
        }
        TextUtils.isEmpty((String) this.f396c);
        String str = (String) this.f395b;
        String str2 = (String) this.f396c;
        boolean z11 = this.f394a;
        i3 i3Var = new i3();
        i3Var.f395b = str;
        i3Var.f396c = str2;
        i3Var.f394a = z11;
        return i3Var;
    }

    public boolean p() {
        cj.e0 e0Var = (cj.e0) this.f396c;
        if (e0Var.T != null) {
            return true;
        }
        BasicItem basicItemE = e0Var.e();
        if ((basicItemE != null ? basicItemE.getItemType() : null) == ItemType.CATERING) {
            return true;
        }
        mv.x xVar = e0Var.f8216f;
        xVar.getClass();
        mv.w wVarA = xVar.a(mv.v.ADDRESS_AUTO_COMPLETE);
        return !(wVarA != null ? wVarA.equals(mv.w.DEFAULT) : false);
    }

    public void q(i4 i4Var, zw.e eVar) throws zw.a {
        int iIntValue;
        char cCharAt;
        int iM;
        String strO = eVar.O();
        eVar.K();
        if (strO == null) {
            throw new zw.a("Invalid '@' rule");
        }
        int i11 = 0;
        if (!this.f394a && strO.equals("media")) {
            ArrayList<zw.g> arrayListR = r(eVar);
            if (!eVar.k('{')) {
                throw new zw.a("Invalid @media rule: missing rule set");
            }
            eVar.K();
            zw.g gVar = (zw.g) this.f395b;
            for (zw.g gVar2 : arrayListR) {
                if (gVar2 == zw.g.all || gVar2 == gVar) {
                    this.f394a = true;
                    i4Var.f(t(eVar));
                    this.f394a = false;
                    break;
                }
            }
            t(eVar);
            if (!eVar.n() && !eVar.k('}')) {
                throw new zw.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f394a || !strO.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strO + " rule");
            while (!eVar.n() && ((iIntValue = eVar.z().intValue()) != 59 || i11 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i11 > 0 && i11 - 1 == 0) {
                        break;
                    }
                } else {
                    i11++;
                }
            }
        } else {
            String strN = null;
            if (!eVar.n()) {
                int i12 = eVar.f30154b;
                if (eVar.l("url(")) {
                    eVar.K();
                    String strN2 = eVar.N();
                    if (strN2 == null) {
                        String str = (String) eVar.f30157e;
                        StringBuilder sb2 = new StringBuilder();
                        while (!eVar.n() && (cCharAt = str.charAt(eVar.f30154b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !mv.b0.w(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            eVar.f30154b++;
                            if (cCharAt == '\\') {
                                if (!eVar.n()) {
                                    int i13 = eVar.f30154b;
                                    eVar.f30154b = i13 + 1;
                                    cCharAt = str.charAt(i13);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iM2 = zw.e.M(cCharAt);
                                        if (iM2 != -1) {
                                            for (int i14 = 1; i14 <= 5 && !eVar.n() && (iM = zw.e.M(str.charAt(eVar.f30154b))) != -1; i14++) {
                                                eVar.f30154b++;
                                                iM2 = (iM2 * 16) + iM;
                                            }
                                            sb2.append((char) iM2);
                                        }
                                    }
                                }
                            }
                            sb2.append(cCharAt);
                        }
                        strN2 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (strN2 == null) {
                        eVar.f30154b = i12;
                    } else {
                        eVar.K();
                        if (eVar.n() || eVar.l(")")) {
                            strN = strN2;
                        } else {
                            eVar.f30154b = i12;
                        }
                    }
                }
            }
            if (strN == null) {
                strN = eVar.N();
            }
            if (strN == null) {
                throw new zw.a("Invalid @import rule: expected string or url()");
            }
            eVar.K();
            r(eVar);
            if (!eVar.n() && !eVar.k(';')) {
                throw new zw.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        eVar.K();
    }

    public boolean s(i4 i4Var, zw.e eVar) throws zw.a {
        ArrayList<zw.p> arrayListP = eVar.P();
        if (arrayListP == null || arrayListP.isEmpty()) {
            return false;
        }
        if (!eVar.k('{')) {
            throw new zw.a("Malformed rule block: expected '{'");
        }
        eVar.K();
        zw.h1 h1Var = new zw.h1();
        do {
            String strO = eVar.O();
            eVar.K();
            if (!eVar.k(':')) {
                throw new zw.a("Expected ':'");
            }
            eVar.K();
            String str = (String) eVar.f30157e;
            String strSubstring = null;
            if (!eVar.n()) {
                int i11 = eVar.f30154b;
                int iCharAt = str.charAt(i11);
                int i12 = i11;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!mv.b0.w(iCharAt)) {
                        i12 = eVar.f30154b + 1;
                    }
                    iCharAt = eVar.g();
                }
                if (eVar.f30154b > i11) {
                    strSubstring = str.substring(i11, i12);
                } else {
                    eVar.f30154b = i11;
                }
            }
            if (strSubstring == null) {
                throw new zw.a("Expected property value");
            }
            eVar.K();
            if (eVar.k('!')) {
                eVar.K();
                if (!eVar.l("important")) {
                    throw new zw.a("Malformed rule set: found unexpected '!'");
                }
                eVar.K();
            }
            eVar.k(';');
            zw.a3.C(h1Var, strO, strSubstring);
            eVar.K();
            if (eVar.n()) {
                break;
            }
        } while (!eVar.k('}'));
        eVar.K();
        for (zw.p pVar : arrayListP) {
            zw.r rVar = (zw.r) this.f396c;
            zw.o oVar = new zw.o();
            oVar.f48304a = pVar;
            oVar.f48305b = h1Var;
            oVar.f48306c = rVar;
            i4Var.d(oVar);
        }
        return true;
    }

    public i4 t(zw.e eVar) {
        i4 i4Var = new i4(8);
        while (!eVar.n()) {
            try {
                if (!eVar.l("<!--") && !eVar.l("-->")) {
                    if (!eVar.k('@')) {
                        if (!s(i4Var, eVar)) {
                            break;
                        }
                    } else {
                        q(i4Var, eVar);
                    }
                }
            } catch (zw.a e5) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e5.getMessage());
                return i4Var;
            }
        }
        return i4Var;
    }

    public long y(r5.y yVar, long j9, boolean z11, j0 j0Var) {
        l3 l3Var = (l3) this.f396c;
        long jC = l3.c(l3Var, yVar, j9, z11, false, j0Var, false);
        if (!m5.t0.b(jC, (m5.t0) this.f395b)) {
            this.f394a = false;
        }
        l3Var.q(m5.t0.d(jC) ? m2.u0.Cursor : m2.u0.Selection);
        return jC;
    }

    public synchronized qz.m z() {
        return (qz.m) this.f395b;
    }

    public i3(ImageReader imageReader) {
        this.f396c = new Object();
        this.f394a = true;
        this.f395b = imageReader;
    }

    public i3(zw.g gVar, zw.r rVar) {
        this.f394a = false;
        this.f395b = gVar;
        this.f396c = rVar;
    }
}
