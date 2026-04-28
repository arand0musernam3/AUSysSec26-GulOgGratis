package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Trace;
import android.provider.Settings;
import androidx.lifecycle.s1;
import app.cash.paykit.core.exceptions.CashAppPayNetworkException;
import b5.c;
import b5.m;
import b5.m0;
import b5.q0;
import bl.d;
import c5.s2;
import c5.x0;
import c5.y;
import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import d6.g0;
import e20.j0;
import eo.f;
import f4.b;
import f4.n;
import fn.s;
import gl.k;
import i4.e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lz.i;
import org.bouncycastle.iana.AEADAlgorithm;
import u70.o;
import u70.p;
import u70.q;
import v80.f0;
import yb.g;
import yb.h;
import z4.z;
import z4.z0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i11) {
        super(0);
        this.f11a = i11;
        this.f12b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object pVar;
        int i11 = this.f11a;
        boolean z11 = false;
        Object obj = null;
        Object obj2 = this.f12b;
        switch (i11) {
            case 0:
                Iterator it = ((List) obj2).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((z0) next).f47256b.n()) {
                            obj = next;
                        }
                    }
                }
                return (z0) obj;
            case 1:
                ((c) obj2).f5760o.getClass();
                throw new ClassCastException();
            case 2:
                q0 q0Var = ((m0) obj2).H;
                q0Var.f5942p.A = true;
                b5.z0 z0Var = q0Var.f5943q;
                if (z0Var != null) {
                    z0Var.f6033u = true;
                }
                return Unit.f26487a;
            case 3:
                return (d) obj2;
            case 4:
                return (s1) ((a) obj2).invoke();
            case 5:
                f0.j(((x0) obj2).f7407c, null);
                return Unit.f26487a;
            case 6:
                return Unit.f26487a;
            case 7:
                j0 j0Var = (j0) ((s2) obj2).f7374a.f39013b;
                if (!j0Var.f15674b) {
                    if (j0Var.f15675c) {
                        x3.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    j0Var.a();
                    j0Var.f15675c = true;
                }
                return Unit.f26487a;
            case 8:
                return (h4.c) obj2;
            case 9:
                cc.c cVar = (cc.c) obj2;
                if (Intrinsics.areEqual(cVar.f7898j, h.f45821e)) {
                    cVar.d(new g(new CashAppPayNetworkException(bc.a.CONNECTIVITY)));
                }
                return Unit.f26487a;
            case 10:
                g0 g0Var = (g0) obj2;
                z parentLayoutCoordinates = g0Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.n()) {
                    obj = parentLayoutCoordinates;
                }
                if (obj != null && g0Var.m960getPopupContentSizebOM6tXw() != null) {
                    z11 = true;
                }
                return Boolean.valueOf(z11);
            case 11:
                return new b(((ComposeViewTargetLocator) obj2).f8863a);
            case 12:
                return (f) obj2;
            case 13:
                return (s1) ((a) obj2).invoke();
            case 14:
                b bVar = (b) obj2;
                n nVar = bVar.f17290q;
                if (nVar == null) {
                    nVar = new n();
                    bVar.f17290q = nVar;
                }
                if (nVar.f17314b == null) {
                    e0 graphicsContext = ((y) m.h(bVar)).getGraphicsContext();
                    nVar.d();
                    nVar.f17314b = graphicsContext;
                }
                return nVar;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return (s1) ((s) obj2).invoke();
            case 16:
                return (s1) ((s) obj2).invoke();
            case 17:
                return (s1) ((s) obj2).invoke();
            case 18:
                ((g4.g0) obj2).N0();
                return Unit.f26487a;
            case 19:
                return (s1) ((k) obj2).invoke();
            case 20:
                return (s1) ((k) obj2).invoke();
            case 21:
                gy.d dVar = (gy.d) obj2;
                try {
                    o oVar = q.f40850b;
                    pVar = (gy.h) dVar.f20919a.invoke();
                    break;
                } catch (Throwable th2) {
                    o oVar2 = q.f40850b;
                    pVar = new p(th2);
                }
                return new q(pVar);
            case 22:
                return (hn.b) obj2;
            case 23:
                return (s1) ((a) obj2).invoke();
            case 24:
                ContentResolver contentResolver = (ContentResolver) ((i) obj2).f28446b;
                contentResolver.getClass();
                String string = Settings.Secure.getString(contentResolver, "android_id");
                string.getClass();
                return string;
            case 25:
                se.b bVar2 = (se.b) obj2;
                Uri uri = Uri.parse("content://com.google.android.gsf.gservices");
                String[] strArr = {"android_id"};
                try {
                    ContentResolver contentResolver2 = (ContentResolver) bVar2.f39010b;
                    contentResolver2.getClass();
                    Cursor cursorQuery = contentResolver2.query(uri, null, null, strArr, null);
                    cursorQuery.getClass();
                    try {
                        if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
                            throw new IllegalStateException("Check failed.");
                        }
                        String string2 = cursorQuery.getString(1);
                        string2.getClass();
                        String hexString = Long.toHexString(Long.parseLong(string2));
                        cursorQuery.close();
                        return hexString;
                    } finally {
                    }
                } catch (Exception unused) {
                    return null;
                }
            case 26:
                return Boolean.valueOf(u00.d.C("androidx.fragment.app.FragmentActivity", ((ye.b) ((dn.k) obj2).f15018b).f()));
            case 27:
                k5.b bVar3 = (k5.b) obj2;
                bVar3.f25964g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar3.a();
                    Trace.endSection();
                    return Unit.f26487a;
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 28:
                MediaCodecList mediaCodecList = (MediaCodecList) ((i) obj2).f28446b;
                mediaCodecList.getClass();
                MediaCodecInfo[] codecInfos = mediaCodecList.getCodecInfos();
                codecInfos.getClass();
                ArrayList arrayList = new ArrayList(codecInfos.length);
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    mediaCodecInfo.getClass();
                    String name = mediaCodecInfo.getName();
                    name.getClass();
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    supportedTypes.getClass();
                    ArrayList arrayList2 = new ArrayList(supportedTypes.length);
                    for (String str : supportedTypes) {
                        arrayList2.add(String.valueOf(str));
                    }
                    arrayList.add(new ky.k(name, arrayList2));
                }
                return arrayList;
            default:
                ((z6.a) ((jb.b) obj2).f24851a).getClass();
                return ky.h.NOT_SUPPORTED;
        }
    }
}
