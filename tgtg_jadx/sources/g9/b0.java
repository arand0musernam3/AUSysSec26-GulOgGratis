package g9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import q1.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends z implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f20105h = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.w f20106g;

    public b0(e0 e0Var) {
        super(e0Var);
        this.f20106g = new i0.w(this);
    }

    @Override // g9.z
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b0) || !super.equals(obj)) {
            return false;
        }
        i0.w wVar = this.f20106g;
        int iF = ((l1) wVar.f22747d).f();
        i0.w wVar2 = ((b0) obj).f20106g;
        if (iF != ((l1) wVar2.f22747d).f() || wVar.f22745b != wVar2.f22745b) {
            return false;
        }
        l1 l1Var = (l1) wVar.f22747d;
        l1Var.getClass();
        for (z zVar : o80.o.b(new k90.f(l1Var, 2))) {
            if (!Intrinsics.areEqual(zVar, ((l1) wVar2.f22747d).b(zVar.f20258b.f27563e))) {
                return false;
            }
        }
        return true;
    }

    @Override // g9.z
    public final int hashCode() {
        i0.w wVar = this.f20106g;
        int iC = wVar.f22745b;
        l1 l1Var = (l1) wVar.f22747d;
        int iF = l1Var.f();
        for (int i11 = 0; i11 < iF; i11++) {
            iC = (((iC * 31) + l1Var.c(i11)) * 31) + ((z) l1Var.h(i11)).hashCode();
        }
        return iC;
    }

    @Override // g9.z
    public final y i(a8.h hVar) {
        y yVarI = super.i(hVar);
        i0.w wVar = this.f20106g;
        wVar.getClass();
        return wVar.A(yVarI, hVar, false, (b0) wVar.f22746c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i0.w wVar = this.f20106g;
        wVar.getClass();
        return new l9.i(wVar);
    }

    @Override // g9.z
    public final void j(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        attributeSet.getClass();
        super.j(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, h9.a.f21669d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        i0.w wVar = this.f20106g;
        wVar.M(resourceId);
        int i11 = wVar.f22745b;
        if (i11 <= 16777215) {
            strValueOf = String.valueOf(i11);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i11);
                strValueOf.getClass();
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i11);
            }
        }
        wVar.f22748e = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    public final y n(a8.h hVar, z zVar) {
        zVar.getClass();
        return this.f20106g.A(super.i(hVar), hVar, true, zVar);
    }

    public final y o(String str, boolean z11, z zVar) {
        y yVarO;
        str.getClass();
        zVar.getClass();
        i0.w wVar = this.f20106g;
        wVar.getClass();
        b0 b0Var = (b0) wVar.f22746c;
        y yVarA = b0Var.f20258b.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = b0Var.iterator();
        while (true) {
            l9.i iVar = (l9.i) it;
            yVarO = null;
            if (!iVar.hasNext()) {
                break;
            }
            z zVar2 = (z) iVar.next();
            if (!Intrinsics.areEqual(zVar2, zVar)) {
                if (zVar2 instanceof b0) {
                    yVarO = ((b0) zVar2).o(str, false, b0Var);
                } else {
                    zVar2.getClass();
                    yVarO = zVar2.f20258b.a(str);
                }
            }
            if (yVarO != null) {
                arrayList.add(yVarO);
            }
        }
        y yVar = (y) CollectionsKt.Y(arrayList);
        b0 b0Var2 = b0Var.f20259c;
        if (b0Var2 != null && z11 && !Intrinsics.areEqual(b0Var2, zVar)) {
            yVarO = b0Var2.o(str, true, b0Var);
        }
        return (y) CollectionsKt.Y(kotlin.collections.y.w(new y[]{yVarA, yVar, yVarO}));
    }

    public final void p(int i11) {
        this.f20106g.M(i11);
    }

    @Override // g9.z
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        i0.w wVar = this.f20106g;
        String str = (String) wVar.f22749f;
        wVar.getClass();
        z zVarV = (str == null || StringsKt.H(str)) ? null : wVar.v(str, true);
        if (zVarV == null) {
            zVarV = wVar.u(wVar.f22745b);
        }
        sb2.append(" startDestination=");
        if (zVarV == null) {
            String str2 = (String) wVar.f22749f;
            if (str2 != null) {
                sb2.append(str2);
            } else {
                String str3 = (String) wVar.f22748e;
                if (str3 != null) {
                    sb2.append(str3);
                } else {
                    sb2.append("0x" + Integer.toHexString(wVar.f22745b));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(zVarV.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
