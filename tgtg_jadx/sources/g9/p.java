package g9;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.n1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import m0.i1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9.f f20186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ky.b f20187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Activity f20188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f20189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnBackPressedDispatcher f20190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.activity.e0 f20191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f20192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u70.t f20193i;

    public p(Context context) {
        Object next;
        context.getClass();
        this.f20185a = context;
        this.f20186b = new l9.f(this, new n(this, 0));
        this.f20187c = new ky.b(context, (short) 0);
        Iterator it = o80.o.d(context, new g2.q(24)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f20188d = (Activity) next;
        this.f20191g = new androidx.activity.e0(this, false, 16);
        this.f20192h = true;
        u0 u0Var = this.f20186b.f27549s;
        u0Var.a(new e0(u0Var));
        this.f20186b.f27549s.a(new b(this.f20185a));
        this.f20193i = u70.l.b(new n(this, 1));
    }

    public static void e(p pVar, Object obj) {
        pVar.getClass();
        obj.getClass();
        l9.f fVar = pVar.f20186b;
        fVar.getClass();
        fVar.o(fVar.f(obj), null);
    }

    public static void f(p pVar, String str) {
        pVar.getClass();
        str.getClass();
        pVar.f20186b.o(str, null);
    }

    public static boolean i(p pVar, String str, boolean z11) {
        pVar.getClass();
        str.getClass();
        l9.f fVar = pVar.f20186b;
        fVar.getClass();
        return fVar.q(str, z11, false) && fVar.b();
    }

    public final int a() {
        kotlin.collections.t tVar = this.f20186b.f27537f;
        int i11 = 0;
        if (tVar != null && tVar.isEmpty()) {
            return 0;
        }
        Iterator<E> it = tVar.iterator();
        while (it.hasNext()) {
            if (!(((l) it.next()).f20163b instanceof b0) && (i11 = i11 + 1) < 0) {
                kotlin.collections.d0.m();
                throw null;
            }
        }
        return i11;
    }

    public final l b() {
        Object next;
        Iterator it = CollectionsKt.f0(this.f20186b.f27537f).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = o80.o.b(it).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (!(((l) next).f20163b instanceof b0)) {
                break;
            }
        }
        return (l) next;
    }

    public final void c(int i11, Bundle bundle) {
        int i12;
        i0 i0Var;
        Bundle bundleX;
        l9.f fVar = this.f20186b;
        z zVar = fVar.f27537f.isEmpty() ? fVar.f27534c : ((l) fVar.f27537f.last()).f20163b;
        if (zVar == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + '.');
        }
        h hVarG = zVar.g(i11);
        if (hVarG != null) {
            i0Var = hVarG.f20122b;
            i12 = hVarG.f20121a;
            Bundle bundle2 = hVarG.f20123c;
            if (bundle2 != null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
                bundleX.putAll(bundle2);
            } else {
                bundleX = null;
            }
        } else {
            i12 = i11;
            i0Var = null;
            bundleX = null;
        }
        if (bundle != null) {
            if (bundleX == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleX.putAll(bundle);
        }
        if (i12 == 0 && i0Var != null) {
            boolean z11 = i0Var.f20141d;
            KClass kClass = i0Var.f20147j;
            int i13 = i0Var.f20140c;
            if (i13 != -1 || kClass != null) {
                if (kClass != null) {
                    if (fVar.p(m9.d.b(ba0.g.I(kClass)), z11, false)) {
                        fVar.b();
                        return;
                    }
                    return;
                } else {
                    if (i13 == -1 || !fVar.p(i13, z11, false)) {
                        return;
                    }
                    fVar.b();
                    return;
                }
            }
        }
        if (i12 == 0) {
            i4.a.f("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            return;
        }
        z zVarD = fVar.d(i12, null);
        if (zVarD != null) {
            fVar.n(zVarD, bundleX, i0Var);
            return;
        }
        int i14 = z.f20256f;
        ky.b bVar = this.f20187c;
        String strA = x.a(bVar, i12);
        if (hVarG == null) {
            i1.k("Navigation action/destination ", strA, " cannot be found from the current destination ", zVar);
            return;
        }
        StringBuilder sbS = e0.f.s("Navigation destination ", strA, " referenced from action ");
        sbS.append(x.a(bVar, i11));
        sbS.append(" cannot be found from the current destination ");
        sbS.append(zVar);
        throw new IllegalArgumentException(sbS.toString().toString());
    }

    public final void d(Object obj, Function1 function1) {
        obj.getClass();
        l9.f fVar = this.f20186b;
        fVar.getClass();
        fVar.o(fVar.f(obj), y9.w.B(function1));
    }

    public final boolean g() {
        Bundle bundleD;
        Intent intent;
        if (a() != 1) {
            return h();
        }
        Activity activity = this.f20188d;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        int i11 = 0;
        l9.f fVar = this.f20186b;
        if (intArray == null) {
            z zVarI = fVar.i();
            zVarI.getClass();
            int i12 = zVarI.f20258b.f27563e;
            for (b0 b0Var = zVarI.f20259c; b0Var != null; b0Var = b0Var.f20259c) {
                l9.h hVar = b0Var.f20258b;
                if (b0Var.f20106g.f22745b != i12) {
                    kotlin.collections.o0.f26530a.getClass();
                    Bundle bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        Intent intent2 = activity.getIntent();
                        intent2.getClass();
                        bundleX.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                        b0 b0VarL = fVar.l();
                        Intent intent3 = activity.getIntent();
                        intent3.getClass();
                        y yVarN = b0VarL.n(new a8.h(intent3.getData(), intent3.getAction(), intent3.getType(), 28), b0VarL);
                        if ((yVarN != null ? yVarN.f20251b : null) != null && (bundleD = yVarN.f20250a.d(yVarN.f20251b)) != null) {
                            bundleX.putAll(bundleD);
                        }
                    }
                    n1 n1Var = new n1(this);
                    int i13 = hVar.f27563e;
                    ArrayList arrayList = (ArrayList) n1Var.f3503e;
                    arrayList.clear();
                    arrayList.add(new w(i13, null));
                    if (((b0) n1Var.f3502d) != null) {
                        n1Var.E();
                    }
                    ((Intent) n1Var.f3501c).putExtra("android-support-nav:controller:deepLinkExtras", bundleX);
                    n1Var.m().c();
                    if (activity != null) {
                        activity.finish();
                    }
                    return true;
                }
                i12 = hVar.f27563e;
            }
        } else if (this.f20189e) {
            activity.getClass();
            Intent intent4 = activity.getIntent();
            Bundle extras2 = intent4.getExtras();
            extras2.getClass();
            int[] intArray2 = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            intArray2.getClass();
            ArrayList arrayList2 = new ArrayList(intArray2.length);
            for (int i14 : intArray2) {
                arrayList2.add(Integer.valueOf(i14));
            }
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayList2.size() >= 2) {
                int iIntValue = ((Number) kotlin.collections.i0.x(arrayList2)).intValue();
                if (parcelableArrayList != null) {
                }
                b0 b0VarJ = fVar.j();
                b0VarJ.getClass();
                z zVarE = l9.f.e(iIntValue, b0VarJ, null, false);
                if (zVarE instanceof b0) {
                    int i15 = b0.f20105h;
                    iIntValue = ((z) o80.r.l(o80.o.d((b0) zVarE, new g2.q(29)))).f20258b.f27563e;
                }
                z zVarI2 = fVar.i();
                if (zVarI2 != null && iIntValue == zVarI2.f20258b.f27563e) {
                    n1 n1Var2 = new n1(this);
                    kotlin.collections.o0.f26530a.getClass();
                    Bundle bundleX2 = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    bundleX2.putParcelable("android-support-nav:controller:deepLinkIntent", intent4);
                    Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle != null) {
                        bundleX2.putAll(bundle);
                    }
                    ((Intent) n1Var2.f3501c).putExtra("android-support-nav:controller:deepLinkExtras", bundleX2);
                    for (Object obj : arrayList2) {
                        int i16 = i11 + 1;
                        if (i11 < 0) {
                            kotlin.collections.d0.n();
                            throw null;
                        }
                        ((ArrayList) n1Var2.f3503e).add(new w(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i11) : null));
                        if (((b0) n1Var2.f3502d) != null) {
                            n1Var2.E();
                        }
                        i11 = i16;
                    }
                    n1Var2.m().c();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean h() {
        l9.f fVar = this.f20186b;
        if (fVar.f27537f.isEmpty()) {
            return false;
        }
        z zVarI = fVar.i();
        zVarI.getClass();
        return fVar.p(zVarI.f20258b.f27563e, true, false) && fVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(Bundle bundle) {
        Bundle bundle2;
        Bundle[] bundleArr;
        Throwable th2;
        if (bundle != null) {
            bundle.setClassLoader(this.f20185a.getClassLoader());
        }
        l9.f fVar = this.f20186b;
        LinkedHashMap linkedHashMap = fVar.f27543m;
        Throwable th3 = null;
        if (bundle == null) {
            th2 = null;
        } else {
            if (bundle.containsKey("android-support-nav:controller:navigatorState")) {
                bundle2 = bundle.getBundle("android-support-nav:controller:navigatorState");
                if (bundle2 == null) {
                    w0.e.D("android-support-nav:controller:navigatorState");
                    throw null;
                }
            } else {
                bundle2 = null;
            }
            fVar.f27535d = bundle2;
            if (bundle.containsKey("android-support-nav:controller:backStack")) {
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Bundle.class);
                orCreateKotlinClass.getClass();
                ArrayList arrayListG = Build.VERSION.SDK_INT >= 34 ? a70.a.g(bundle, "android-support-nav:controller:backStack", y9.w.v(orCreateKotlinClass)) : bundle.getParcelableArrayList("android-support-nav:controller:backStack");
                if (arrayListG == null) {
                    w0.e.D("android-support-nav:controller:backStack");
                    throw null;
                }
                bundleArr = (Bundle[]) arrayListG.toArray(new Bundle[0]);
            } else {
                bundleArr = null;
            }
            fVar.f27536e = bundleArr;
            linkedHashMap.clear();
            if (bundle.containsKey("android-support-nav:controller:backStackDestIds") && bundle.containsKey("android-support-nav:controller:backStackIds")) {
                int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
                if (intArray == null) {
                    w0.e.D("android-support-nav:controller:backStackDestIds");
                    throw null;
                }
                ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
                if (stringArrayList == null) {
                    w0.e.D("android-support-nav:controller:backStackIds");
                    throw null;
                }
                int length = intArray.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    int i13 = i12 + 1;
                    Throwable th4 = th3;
                    fVar.l.put(Integer.valueOf(intArray[i11]), !Intrinsics.areEqual(stringArrayList.get(i12), "") ? (String) stringArrayList.get(i12) : th4);
                    i11++;
                    i12 = i13;
                    th3 = th4;
                }
            }
            th2 = th3;
            if (bundle.containsKey("android-support-nav:controller:backStackStates")) {
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
                if (stringArrayList2 == null) {
                    w0.e.D("android-support-nav:controller:backStackStates");
                    throw th2;
                }
                for (String str : stringArrayList2) {
                    if (bundle.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                        String strK = e0.f.k("android-support-nav:controller:backStackStates:", str);
                        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Bundle.class);
                        orCreateKotlinClass2.getClass();
                        ArrayList arrayListG2 = Build.VERSION.SDK_INT >= 34 ? a70.a.g(bundle, strK, y9.w.v(orCreateKotlinClass2)) : bundle.getParcelableArrayList(strK);
                        if (arrayListG2 == null) {
                            w0.e.D(strK);
                            throw th2;
                        }
                        kotlin.collections.t tVar = new kotlin.collections.t(arrayListG2.size());
                        Iterator it = arrayListG2.iterator();
                        while (it.hasNext()) {
                            tVar.addLast(new m((Bundle) it.next()));
                        }
                        linkedHashMap.put(str, tVar);
                    }
                }
            }
        }
        if (bundle != null) {
            boolean z11 = bundle.getBoolean("android-support-nav:controller:deepLinkHandled", false);
            Boolean boolValueOf = (z11 || !bundle.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z11) : th2;
            this.f20189e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
        }
    }

    public final Bundle k() {
        Bundle bundleX;
        l9.f fVar = this.f20186b;
        LinkedHashMap linkedHashMap = fVar.f27543m;
        kotlin.collections.t tVar = fVar.f27537f;
        LinkedHashMap linkedHashMap2 = fVar.l;
        ArrayList arrayList = new ArrayList();
        kotlin.collections.o0.f26530a.getClass();
        Bundle bundleX2 = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
        for (Map.Entry entry : x0.k(fVar.f27549s.f20223a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((t0) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                str.getClass();
                bundleX2.putBundle(str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundleX = null;
        } else {
            kotlin.collections.o0.f26530a.getClass();
            bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            xz.b.H(bundleX2, "android-support-nav:controller:navigatorState:names", arrayList);
            bundleX.putBundle("android-support-nav:controller:navigatorState", bundleX2);
        }
        if (!tVar.isEmpty()) {
            if (bundleX == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            Iterator<E> it = tVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(new m((l) it.next()).a());
            }
            bundleX.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
        }
        if (!linkedHashMap2.isEmpty()) {
            if (bundleX == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            int[] iArr = new int[linkedHashMap2.size()];
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                int i12 = i11 + 1;
                iArr[i11] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i11 = i12;
            }
            bundleX.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            xz.b.H(bundleX, "android-support-nav:controller:backStackIds", arrayList3);
        }
        if (!linkedHashMap.isEmpty()) {
            if (bundleX == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            ArrayList arrayList4 = new ArrayList();
            for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                String str3 = (String) entry3.getKey();
                kotlin.collections.t tVar2 = (kotlin.collections.t) entry3.getValue();
                arrayList4.add(str3);
                ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                Iterator it2 = tVar2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((m) it2.next()).a());
                }
                bundleX.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
            }
            xz.b.H(bundleX, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (this.f20189e) {
            if (bundleX == null) {
                kotlin.collections.o0.f26530a.getClass();
                bundleX = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundleX.putBoolean("android-support-nav:controller:deepLinkHandled", this.f20189e);
        }
        return bundleX;
    }
}
