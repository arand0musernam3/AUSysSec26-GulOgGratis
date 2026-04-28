package j30;

import a90.v;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.location.LocationManager;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import b0.z;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.DynamicPriceInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.wf;
import com.google.android.gms.oss.licenses.v2.zzag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.messaging.a0;
import i4.t;
import j4.s;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import l8.p;
import l8.w;
import l8.x;
import m0.f1;
import m3.y1;
import org.bouncycastle.iana.AEADAlgorithm;
import p.l0;
import pg.m3;
import pg.p1;
import q1.b0;
import q1.g1;
import q1.t0;
import q90.m0;
import q90.n0;
import qc.y;
import t.c0;
import t.d0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class g implements x0.c, OnCompleteListener, oa0.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static g f24500e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f24502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f24504d;

    public g(List list) {
        this.f24501a = 7;
        this.f24504d = list;
        this.f24502b = new ArrayList(list.size());
        this.f24503c = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((ArrayList) this.f24502b).add(new ke.n((List) ((qe.j) list.get(i11)).f36979b.f21216b));
            ((ArrayList) this.f24503c).add(((qe.j) list.get(i11)).f36980c.g());
        }
    }

    public static boolean e(Editable editable, KeyEvent keyEvent, boolean z11) {
        x[] xVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (xVarArr = (x[]) editable.getSpans(selectionStart, selectionEnd, x.class)) != null && xVarArr.length > 0) {
                for (x xVar : xVarArr) {
                    int spanStart = editable.getSpanStart(xVar);
                    int spanEnd = editable.getSpanEnd(xVar);
                    if ((z11 && spanStart == selectionStart) || ((!z11 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static g s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static g t(Context context, AttributeSet attributeSet, int[] iArr, int i11) {
        return new g(context, context.obtainStyledAttributes(attributeSet, iArr, i11, 0));
    }

    public void A(z5.m mVar) {
        ((k4.b) this.f24504d).f25937a.f25934b = mVar;
    }

    public void B(long j9) {
        ((k4.b) this.f24504d).f25937a.f25936d = j9;
    }

    public void C(String str) {
        this.f24502b = str;
        Iterator it = ((ArrayList) this.f24504d).iterator();
        while (it.hasNext()) {
            xe.a aVar = ((gf.a) it.next()).f20404b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connector");
                aVar = null;
            }
            a0 a0Var = aVar.f44238a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) a0Var.f12779b).readLock();
            lock.lock();
            try {
                xe.b bVar = (xe.b) a0Var.f12780c;
                lock.unlock();
                String str2 = bVar.f44240a;
                a0Var.X(new xe.b(str, bVar.f44241b, bVar.f44242c));
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }

    public void D(DynamicPriceInfo dynamicPriceInfo) {
        switch (this.f24501a) {
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                p1 p1Var = (p1) this.f24503c;
                AppCompatImageView appCompatImageView = p1Var.f35062v;
                appCompatImageView.getClass();
                appCompatImageView.setVisibility(dynamicPriceInfo != null ? 0 : 8);
                AppCompatImageView appCompatImageView2 = p1Var.E;
                appCompatImageView2.getClass();
                appCompatImageView2.setVisibility(8);
                break;
            default:
                m3 m3Var = (m3) this.f24503c;
                AppCompatImageView appCompatImageView3 = m3Var.f34996w;
                appCompatImageView3.getClass();
                appCompatImageView3.setVisibility(dynamicPriceInfo != null ? 0 : 8);
                AppCompatImageView appCompatImageView4 = m3Var.F;
                appCompatImageView4.getClass();
                appCompatImageView4.setVisibility(8);
                break;
        }
    }

    public void E(n6.h hVar, int i11, int i12, int i13) {
        hVar.getClass();
        int i14 = hVar.f30583e0;
        int i15 = hVar.f30585f0;
        hVar.f30583e0 = 0;
        hVar.f30585f0 = 0;
        hVar.T(i12);
        hVar.O(i13);
        if (i14 < 0) {
            hVar.f30583e0 = 0;
        } else {
            hVar.f30583e0 = i14;
        }
        if (i15 < 0) {
            hVar.f30585f0 = 0;
        } else {
            hVar.f30585f0 = i15;
        }
        n6.h hVar2 = (n6.h) this.f24504d;
        hVar2.f30622y0 = i11;
        hVar2.a0();
    }

    public void F(KClass kClass, KSerializer kSerializer) {
        kClass.getClass();
        kSerializer.getClass();
        ((ArrayList) this.f24503c).add(new Pair(kClass, kSerializer));
    }

    public void G(n6.h hVar) {
        ArrayList arrayList = (ArrayList) this.f24502b;
        arrayList.clear();
        int size = hVar.f30619v0.size();
        for (int i11 = 0; i11 < size; i11++) {
            n6.g gVar = (n6.g) hVar.f30619v0.get(i11);
            n6.f[] fVarArr = gVar.V;
            n6.f fVar = fVarArr[0];
            n6.f fVar2 = n6.f.MATCH_CONSTRAINT;
            if (fVar == fVar2 || fVarArr[1] == fVar2) {
                arrayList.add(gVar);
            }
        }
        hVar.f30621x0.f804b = true;
    }

    public void H(Object obj, String str) {
        g gVar = new g(3, (char) 0);
        ((g) this.f24504d).f24504d = gVar;
        this.f24504d = gVar;
        gVar.f24503c = obj;
        gVar.f24502b = str;
    }

    public void a(KClass kClass, Function1 function1, Map map, u3.d dVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f24503c;
        if (linkedHashMap.containsKey(kClass)) {
            org.bouncycastle.jce.provider.a.g(kClass.getSimpleName(), 46, "An `entry` with the same `clazz` has already been added: ");
        } else {
            linkedHashMap.put(kClass, new n9.c(kClass, function1, map, dVar));
        }
    }

    public int b(int i11) {
        int iA;
        BiometricPrompt.CryptoObject cryptoObjectA;
        Object objInvoke;
        ky.b bVar = (ky.b) this.f24502b;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 30) {
            BiometricManager biometricManager = (BiometricManager) this.f24503c;
            if (biometricManager != null) {
                return t.o.a(biometricManager, i11);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        if (!a.a.F(i11)) {
            return -2;
        }
        if (i11 == 0) {
            return 12;
        }
        Context context = bVar.f26684a;
        if (c0.a(context) == null) {
            return 12;
        }
        int iC = 0;
        if (a.a.D(i11)) {
            KeyguardManager keyguardManagerA = c0.a(context);
            return keyguardManagerA == null ? false : c0.b(keyguardManagerA) ? 0 : 11;
        }
        if (i12 != 29) {
            if (i12 != 28) {
                return c();
            }
            if (!((context == null || context.getPackageManager() == null || !d0.a(context.getPackageManager())) ? false : true)) {
                return 12;
            }
            KeyguardManager keyguardManagerA2 = c0.a(bVar.f26684a);
            return !(keyguardManagerA2 == null ? false : c0.b(keyguardManagerA2)) ? c() : c() == 0 ? 0 : -1;
        }
        if ((i11 & 255) == 255) {
            BiometricManager biometricManager2 = (BiometricManager) this.f24503c;
            if (biometricManager2 != null) {
                return t.n.a(biometricManager2);
            }
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        Method methodC = t.n.c();
        if (methodC != null && (cryptoObjectA = z.A(z.r())) != null) {
            if (i12 == 29) {
                try {
                    objInvoke = methodC.invoke((BiometricManager) this.f24503c, cryptoObjectA);
                } catch (IllegalAccessException e5) {
                    e = e5;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                } catch (IllegalArgumentException e11) {
                    e = e11;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                } catch (InvocationTargetException e12) {
                    e = e12;
                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                }
            } else {
                objInvoke = null;
            }
            if (objInvoke instanceof Integer) {
                return ((Integer) objInvoke).intValue();
            }
            Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
        }
        BiometricManager biometricManager3 = (BiometricManager) this.f24503c;
        if (biometricManager3 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            iA = 1;
        } else {
            iA = t.n.a(biometricManager3);
        }
        String str = Build.MODEL;
        if (Build.VERSION.SDK_INT < 30 && str != null) {
            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                if (str.equals(str2)) {
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (z || iA != 0) {
            return iA;
        }
        KeyguardManager keyguardManagerA3 = c0.a(bVar.f26684a);
        if (!(keyguardManagerA3 == null ? false : c0.b(keyguardManagerA3))) {
            iC = c();
        } else if (c() != 0) {
            iC = -1;
        }
        return iC;
    }

    public int c() {
        z6.a aVar = (z6.a) this.f24504d;
        if (aVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        aVar.getClass();
        return 12;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(x70.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rf.a
            if (r0 == 0) goto L13
            r0 = r5
            rf.a r0 = (rf.a) r0
            int r1 = r0.f37960m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37960m = r1
            goto L1a
        L13:
            rf.a r0 = new rf.a
            z70.c r5 = (z70.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f37959k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f37960m
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            j30.g r0 = r0.f37958j
            ba0.g.M(r5)     // Catch: java.io.FileNotFoundException -> L2b
            goto L47
        L2b:
            r5 = move-exception
            goto L74
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L34:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.f24502b     // Catch: java.io.FileNotFoundException -> L72
            hf.g r5 = (hf.g) r5     // Catch: java.io.FileNotFoundException -> L72
            r0.f37958j = r4     // Catch: java.io.FileNotFoundException -> L72
            r0.f37960m = r3     // Catch: java.io.FileNotFoundException -> L72
            java.lang.Object r5 = r5.f(r0)     // Catch: java.io.FileNotFoundException -> L72
            if (r5 != r1) goto L46
            return r1
        L46:
            r0 = r4
        L47:
            java.lang.Object r5 = r0.f24502b
            hf.g r5 = (hf.g) r5
            java.util.ArrayList r5 = r5.b()
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L58
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L58:
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r5.next()
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            r0.w(r1)
            goto L5c
        L6f:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        L72:
            r5 = move-exception
            r0 = r4
        L74:
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L87
            java.lang.Object r0 = r0.f24503c
            kf.b r0 = (kf.b) r0
            java.lang.String r1 = "Event storage file not found: "
            java.lang.String r5 = r1.concat(r5)
            r0.d(r5)
        L87:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j30.g.d(x70.c):java.lang.Object");
    }

    @Override // oa0.k
    public Object f(Object obj) {
        jb.b bVar = (jb.b) this.f24504d;
        q90.z zVar = (q90.z) this.f24502b;
        String strC = ((n90.c) bVar.f24851a).c((KSerializer) this.f24503c, obj);
        n0.Companion.getClass();
        return m0.a(strC, zVar);
    }

    public void g(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f24502b;
        p40.g gVar = new p40.g(byteArrayOutputStream, map, (HashMap) this.f24503c, (m40.c) this.f24504d);
        m40.c cVar = (m40.c) map.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, gVar);
            return;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    public float h(j6.c cVar) {
        HashMap map = (HashMap) this.f24502b;
        HashMap map2 = (HashMap) this.f24503c;
        if (!(cVar instanceof j6.g)) {
            if (cVar instanceof j6.e) {
                return ((j6.e) cVar).d();
            }
            return 0.0f;
        }
        String strC = ((j6.g) cVar).c();
        if (map2.containsKey(strC)) {
            return ((k6.d) map2.get(strC)).value();
        }
        if (map.containsKey(strC)) {
            return ((Integer) map.get(strC)).floatValue();
        }
        return 0.0f;
    }

    public t i() {
        return ((k4.b) this.f24504d).f25937a.f25935c;
    }

    public ColorStateList j(int i11) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) this.f24503c;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateListB = androidx.core.app.e.b((Context) this.f24502b, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateListB;
    }

    public Drawable k(int i11) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f24503c;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) ? typedArray.getDrawable(i11) : b0.a0.x((Context) this.f24502b, resourceId);
    }

    public Drawable l(int i11) {
        int resourceId;
        Drawable drawableE;
        if (!((TypedArray) this.f24503c).hasValue(i11) || (resourceId = ((TypedArray) this.f24503c).getResourceId(i11, 0)) == 0) {
            return null;
        }
        p.m mVarA = p.m.a();
        Context context = (Context) this.f24502b;
        synchronized (mVarA) {
            drawableE = mVarA.f33947a.e(context, resourceId, true);
        }
        return drawableE;
    }

    public Typeface m(int i11, int i12, l0 l0Var) {
        int resourceId = ((TypedArray) this.f24503c).getResourceId(i11, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f24504d) == null) {
            this.f24504d = new TypedValue();
        }
        Context context = (Context) this.f24502b;
        TypedValue typedValue = (TypedValue) this.f24504d;
        ThreadLocal threadLocal = w6.j.f43256a;
        if (context.isRestricted()) {
            return null;
        }
        return w6.j.c(context, resourceId, typedValue, i12, l0Var, true, false);
    }

    public void n(rt.e eVar) {
        try {
            u00.h hVar = (u00.h) this.f24503c;
            t00.g gVar = new t00.g(this, eVar);
            Parcel parcelL = hVar.L();
            n00.d.d(parcelL, gVar);
            hVar.M(9, parcelL);
        } catch (RemoteException e5) {
            y.l(e5);
        }
    }

    public long o() {
        return ((k4.b) this.f24504d).f25937a.f25936d;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        oz.b bVar = (oz.b) this.f24503c;
        String str = (String) this.f24502b;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f24504d;
        synchronized (bVar.f33803a) {
            bVar.f33803a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
        boolean z11 = th2 instanceof CancellationException;
        e6.i iVar = (e6.i) this.f24504d;
        if (z11) {
            pd.g.n(null, iVar.d(new f1(((String) this.f24502b).concat(" cancelled."), th2)));
        } else {
            iVar.b(null);
        }
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        x0.g.e(true, (ListenableFuture) this.f24503c, (e6.i) this.f24504d, w.b.F());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:46|94|47|(1:49)(1:52)|53|(4:56|(3:101|58|104)(1:103)|102|54)|100|59|98|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r0 == r3) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r10 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0136, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0029, B:24:0x0051], limit reached: 105 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00a5 -> B:39:0x00a8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(x70.c r18) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j30.g.p(x70.c):java.lang.Object");
    }

    public boolean q(CharSequence charSequence, int i11, int i12, w wVar) {
        if ((wVar.f27493c & 3) == 0) {
            l8.d dVar = (l8.d) this.f24504d;
            m8.a aVarB = wVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) aVarB.f21601d).getShort(iA + aVarB.f21598a);
            }
            dVar.getClass();
            ThreadLocal threadLocal = l8.d.f27446b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i11 < i12) {
                sb2.append(charSequence.charAt(i11));
                i11++;
            }
            boolean zHasGlyph = dVar.f27447a.hasGlyph(sb2.toString());
            int i13 = wVar.f27493c & 4;
            wVar.f27493c = zHasGlyph ? i13 | 2 : i13 | 1;
        }
        return (wVar.f27493c & 3) == 2;
    }

    public boolean r(int i11, n6.g gVar, o6.c cVar) {
        o6.b bVar = (o6.b) this.f24503c;
        n6.f[] fVarArr = gVar.V;
        int[] iArr = gVar.f30612u;
        bVar.f31992a = fVarArr[0];
        bVar.f31993b = fVarArr[1];
        bVar.f31994c = gVar.s();
        bVar.f31995d = gVar.m();
        bVar.f32000i = false;
        bVar.f32001j = i11;
        n6.f fVar = bVar.f31992a;
        n6.f fVar2 = n6.f.MATCH_CONSTRAINT;
        boolean z11 = fVar == fVar2;
        boolean z12 = bVar.f31993b == fVar2;
        boolean z13 = z11 && gVar.Z > 0.0f;
        boolean z14 = z12 && gVar.Z > 0.0f;
        if (z13 && iArr[0] == 4) {
            bVar.f31992a = n6.f.FIXED;
        }
        if (z14 && iArr[1] == 4) {
            bVar.f31993b = n6.f.FIXED;
        }
        cVar.b(gVar, bVar);
        gVar.T(bVar.f31996e);
        gVar.O(bVar.f31997f);
        gVar.F = bVar.f31999h;
        gVar.K(bVar.f31998g);
        bVar.f32001j = 0;
        return bVar.f32000i;
    }

    public String toString() {
        switch (this.f24501a) {
            case 0:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.f24502b);
                sb2.append('{');
                dn.k kVar = (dn.k) ((dn.k) this.f24503c).f15019c;
                String str = "";
                while (kVar != null) {
                    Object obj = kVar.f15018b;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    kVar = (dn.k) kVar.f15019c;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 4:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.f24502b);
                sb3.append('{');
                g gVar = (g) ((g) this.f24503c).f24504d;
                String str2 = "";
                while (gVar != null) {
                    Object obj2 = gVar.f24503c;
                    sb3.append(str2);
                    String str3 = (String) gVar.f24502b;
                    if (str3 != null) {
                        sb3.append(str3);
                        sb3.append('=');
                    }
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        sb3.append((CharSequence) Arrays.deepToString(new Object[]{obj2}), 1, r2.length() - 1);
                    }
                    gVar = (g) gVar.f24504d;
                    str2 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public Object u(CharSequence charSequence, int i11, int i12, int i13, boolean z11, p pVar) {
        int i14;
        char c3;
        wf wfVar = new wf((l8.t) ((a0) this.f24503c).f12781d);
        int iCodePointAt = Character.codePointAt(charSequence, i11);
        int i15 = 0;
        boolean zH = true;
        int iCharCount = i11;
        loop0: while (true) {
            i14 = iCharCount;
            while (iCharCount < i12 && i15 < i13 && zH) {
                SparseArray sparseArray = ((l8.t) wfVar.f12016f).f27484a;
                l8.t tVar = sparseArray == null ? null : (l8.t) sparseArray.get(iCodePointAt);
                if (wfVar.f12012b == 2) {
                    if (tVar != null) {
                        wfVar.f12016f = tVar;
                        wfVar.f12014d++;
                    } else {
                        if (iCodePointAt == 65038) {
                            wfVar.a();
                        } else if (iCodePointAt != 65039) {
                            l8.t tVar2 = (l8.t) wfVar.f12016f;
                            if (tVar2.f27485b != null) {
                                if (wfVar.f12014d != 1) {
                                    wfVar.f12017g = tVar2;
                                    wfVar.a();
                                } else if (wfVar.b()) {
                                    wfVar.f12017g = (l8.t) wfVar.f12016f;
                                    wfVar.a();
                                } else {
                                    wfVar.a();
                                }
                                c3 = 3;
                            } else {
                                wfVar.a();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                } else if (tVar == null) {
                    wfVar.a();
                    c3 = 1;
                } else {
                    wfVar.f12012b = 2;
                    wfVar.f12016f = tVar;
                    wfVar.f12014d = 1;
                    c3 = 2;
                }
                wfVar.f12013c = iCodePointAt;
                if (c3 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i14)) + i14;
                    if (iCharCount < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c3 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i12) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c3 == 3) {
                    if (z11 || !q(charSequence, i14, iCharCount, ((l8.t) wfVar.f12017g).f27485b)) {
                        zH = pVar.h(charSequence, i14, iCharCount, ((l8.t) wfVar.f12017g).f27485b);
                        i15++;
                    }
                }
            }
            break loop0;
        }
        if (wfVar.f12012b == 2 && ((l8.t) wfVar.f12016f).f27485b != null && ((wfVar.f12014d > 1 || wfVar.b()) && i15 < i13 && zH && (z11 || !q(charSequence, i14, iCharCount, ((l8.t) wfVar.f12016f).f27485b)))) {
            pVar.h(charSequence, i14, iCharCount, ((l8.t) wfVar.f12016f).f27485b);
        }
        return pVar.g();
    }

    public void v() {
        ((TypedArray) this.f24503c).recycle();
    }

    public void w(String str) {
        ye.b bVar = (ye.b) this.f24504d;
        f0.B(bVar.f45854c, bVar.f45857f, null, new rf.c(this, str, null, 0), 2);
    }

    public void x(t tVar) {
        ((k4.b) this.f24504d).f25937a.f25935c = tVar;
    }

    public void y(z5.c cVar) {
        ((k4.b) this.f24504d).f25937a.f25933a = cVar;
    }

    public void z(String str) {
        this.f24503c = str;
        Iterator it = ((ArrayList) this.f24504d).iterator();
        while (it.hasNext()) {
            xe.a aVar = ((gf.a) it.next()).f20404b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connector");
                aVar = null;
            }
            a0 a0Var = aVar.f44238a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) a0Var.f12779b).readLock();
            lock.lock();
            try {
                xe.b bVar = (xe.b) a0Var.f12780c;
                lock.unlock();
                a0Var.X(new xe.b(bVar.f44240a, str, bVar.f44242c));
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i11) {
        this.f24501a = i11;
        this.f24502b = obj;
        this.f24503c = obj2;
        this.f24504d = obj3;
    }

    public /* synthetic */ g(oz.b bVar, String str, ScheduledFuture scheduledFuture) {
        this.f24501a = 19;
        this.f24503c = bVar;
        this.f24502b = str;
        this.f24504d = scheduledFuture;
    }

    public g(t00.c cVar, u00.h hVar) {
        this.f24501a = 29;
        this.f24503c = hVar;
        i0.h(cVar);
        this.f24502b = cVar;
    }

    public g(int i11, byte b8) {
        this.f24501a = i11;
        switch (i11) {
            case 24:
                this.f24502b = new b0(16);
                long[] jArr = g1.f35760a;
                this.f24503c = new t0();
                this.f24504d = new l20.c(21);
                break;
            case 25:
                String strE = s.e();
                ia0.j jVar = ia0.j.f23646d;
                this.f24502b = r40.d.p(strE);
                this.f24503c = q90.b0.f36414e;
                this.f24504d = new ArrayList();
                break;
            default:
                this.f24504d = new ArrayList();
                break;
        }
    }

    public g(hf.g gVar, kf.b bVar, ye.b bVar2) {
        this.f24501a = 27;
        gVar.getClass();
        bVar.getClass();
        this.f24502b = gVar;
        this.f24503c = bVar;
        this.f24504d = bVar2;
    }

    public /* synthetic */ g(int i11, char c3) {
        this.f24501a = i11;
    }

    public g(KClass kClass) {
        this.f24501a = 22;
        kClass.getClass();
        this.f24502b = kClass;
        this.f24503c = new ArrayList();
    }

    public g(y1 y1Var) {
        this.f24501a = 11;
        this.f24502b = new u3.a(0);
        this.f24503c = new u3.c();
        this.f24504d = new lw.b(28, this, y1Var);
    }

    public g(BasicItem basicItem, m3 m3Var, mm.b bVar, String str) {
        this.f24501a = 16;
        basicItem.getClass();
        m3Var.getClass();
        bVar.getClass();
        this.f24502b = basicItem;
        this.f24503c = m3Var;
        this.f24504d = bVar;
    }

    public g(k0.g gVar) {
        this.f24501a = 2;
        this.f24502b = gVar;
        this.f24503c = w.b.q(1);
        this.f24504d = w.b.r(k0.d.f25614a);
    }

    public g(BasicItem basicItem, p1 p1Var, mm.b bVar, String str) {
        this.f24501a = 15;
        basicItem.getClass();
        p1Var.getClass();
        bVar.getClass();
        this.f24502b = basicItem;
        this.f24503c = p1Var;
        this.f24504d = bVar;
    }

    public g(zzag zzagVar) {
        this.f24501a = 13;
        this.f24502b = zzagVar;
        this.f24503c = new LinkedHashMap();
        this.f24504d = new LinkedHashMap();
    }

    public g(View view) {
        this.f24501a = 26;
        this.f24502b = view;
        this.f24503c = u70.l.a(u70.m.NONE, new ky.i(this, 11));
        this.f24504d = new a50.c(view);
    }

    public g(k4.b bVar) {
        this.f24501a = 5;
        this.f24504d = bVar;
        this.f24502b = new jd.f(this, 4);
    }

    public g(Context context, TypedArray typedArray) {
        this.f24501a = 20;
        this.f24502b = context;
        this.f24503c = typedArray;
    }

    public g(Context context, LocationManager locationManager) {
        this.f24501a = 1;
        this.f24504d = new h2.a();
        this.f24502b = context;
        this.f24503c = locationManager;
    }

    public g(n6.h hVar) {
        this.f24501a = 18;
        this.f24502b = new ArrayList();
        this.f24503c = new o6.b();
        this.f24504d = hVar;
    }

    public g(a0 a0Var, l50.a aVar, l8.d dVar, Set set) {
        this.f24501a = 9;
        this.f24502b = aVar;
        this.f24503c = a0Var;
        this.f24504d = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            u(str, 0, str.length(), 1, true, new v(str, 4));
        }
    }

    public g(String str, int i11) {
        this.f24501a = i11;
        switch (i11) {
            case 4:
                g gVar = new g(3, (char) 0);
                this.f24503c = gVar;
                this.f24504d = gVar;
                this.f24502b = str;
                break;
            default:
                dn.k kVar = new dn.k(22, false);
                this.f24503c = kVar;
                this.f24504d = kVar;
                this.f24502b = str;
                break;
        }
    }

    public g(ListenableFuture listenableFuture, e6.i iVar, String str) {
        this.f24501a = 10;
        this.f24503c = listenableFuture;
        this.f24504d = iVar;
        this.f24502b = str;
    }

    public g(int i11) {
        this.f24501a = 12;
        this.f24502b = i11 != 1 ? new b0(i11) : null;
    }

    public g(ky.b bVar) {
        this.f24501a = 28;
        this.f24502b = bVar;
        int i11 = Build.VERSION.SDK_INT;
        this.f24503c = i11 >= 29 ? t.n.b(bVar.f26684a) : null;
        this.f24504d = i11 <= 29 ? new z6.a() : null;
    }
}
