package g9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@s0("navigation")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lg9/e0;", "Lg9/t0;", "Lg9/b0;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n90#2:135\n106#2:156\n90#2:158\n27#3:136\n46#3:137\n32#3,4:138\n31#3,7:148\n126#4:142\n153#4,3:143\n37#5,2:146\n1#6:155\n1#6:157\n*S KotlinDebug\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n*L\n93#1:135\n94#1:156\n107#1:158\n94#1:136\n94#1:137\n94#1:138,4\n94#1:148,7\n94#1:142\n94#1:143,3\n94#1:146,2\n94#1:155\n*E\n"})
public class e0 extends t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f20115c;

    public e0(u0 u0Var) {
        u0Var.getClass();
        this.f20115c = u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, android.os.Bundle] */
    @Override // g9.t0
    public final void d(List list, i0 i0Var) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            z zVar = lVar.f20163b;
            zVar.getClass();
            b0 b0Var = (b0) zVar;
            i0.w wVar = b0Var.f20106g;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = lVar.f20169h.a();
            int i11 = wVar.f22745b;
            String str = (String) wVar.f22749f;
            if (i11 == 0 && str == null) {
                l9.h hVar = b0Var.f20258b;
                String strValueOf = hVar.f27560b;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(hVar.f27563e);
                }
                strValueOf.getClass();
                if (((b0) wVar.f22746c).f20258b.f27563e == 0) {
                    strValueOf = "the root navigation";
                }
                e40.a.g("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            z zVarV = str != null ? wVar.v(str, false) : (z) ((l1) wVar.f22747d).b(i11);
            if (zVarV == null) {
                if (((String) wVar.f22748e) == null) {
                    String strValueOf2 = (String) wVar.f22749f;
                    if (strValueOf2 == null) {
                        strValueOf2 = String.valueOf(wVar.f22745b);
                    }
                    wVar.f22748e = strValueOf2;
                }
                String str2 = (String) wVar.f22748e;
                str2.getClass();
                i4.a.f(w.a0.p("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            l9.h hVar2 = zVarV.f20258b;
            if (str != null) {
                if (!Intrinsics.areEqual(str, hVar2.f27564f)) {
                    y yVarA = hVar2.a(str);
                    Bundle bundle = yVarA != null ? yVarA.f20251b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        kotlin.collections.o0.f26530a.getClass();
                        ?? X = jb.u.x((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        X.putAll(bundle);
                        Bundle bundle2 = (Bundle) objectRef.element;
                        if (bundle2 != null) {
                            X.putAll(bundle2);
                        }
                        objectRef.element = X;
                    }
                }
                if (zVarV.h().isEmpty()) {
                    continue;
                } else {
                    ArrayList arrayListF = w0.e.F(zVarV.h(), new d0(objectRef, 0));
                    if (!arrayListF.isEmpty()) {
                        org.bouncycastle.jce.provider.a.j("Cannot navigate to startDestination ", zVarV, ". Missing required arguments [", arrayListF, 93);
                        return;
                    }
                }
            }
            this.f20115c.b(zVarV.f20257a).d(kotlin.collections.c0.c(b().b(zVarV, zVarV.d((Bundle) objectRef.element))), i0Var);
        }
    }

    @Override // g9.t0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b0 a() {
        return new b0(this);
    }
}
