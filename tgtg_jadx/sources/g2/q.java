package g2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.viewmodel.CreationExtras;
import b5.r0;
import g3.ka;
import g3.v3;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import l3.g0;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.i0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18207a;

    public /* synthetic */ q(int i11) {
        this.f18207a = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18207a) {
            case 0:
                return Unit.f26487a;
            case 1:
                List list = (List) obj;
                return new b0(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 2:
                ((Integer) obj).intValue();
                return n0.f26529a;
            case 3:
                ((Integer) obj).getClass();
                r rVar = c0.f18151a;
                return -1;
            case 4:
                r0 r0Var = (r0) obj;
                r0Var.c(g3.k.f18928e, (int) (r0Var.b().u() >> 32));
                r0Var.c(g3.k.f18927d, 0.0f);
                return Unit.f26487a;
            case 5:
                j5.z.m((j5.b0) obj, 0);
                return Unit.f26487a;
            case 6:
                j5.z.m((j5.b0) obj, 1);
                return Unit.f26487a;
            case 7:
                j5.z.q((j5.b0) obj);
                return Unit.f26487a;
            case 8:
                float f11 = v3.f19625a;
                return Boolean.TRUE;
            case 9:
                j5.z.q((j5.b0) obj);
                return Unit.f26487a;
            case 10:
                KProperty[] kPropertyArr = j5.z.f24734a;
                j5.a0 a0Var = j5.x.f24729x;
                Unit unit = Unit.f26487a;
                ((j5.b0) obj).b(a0Var, unit);
                return unit;
            case 11:
                return Unit.f26487a;
            case 12:
                return Unit.f26487a;
            case 13:
                return Unit.f26487a;
            case 14:
                i0 i0Var = (i0) obj;
                i0Var.f39456a = 6000;
                Float fValueOf = Float.valueOf(90.0f);
                i0Var.a(300, fValueOf).f39453b = g0.f26961b;
                i0Var.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                i0Var.a(1800, fValueOf2);
                i0Var.a(3000, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                i0Var.a(3300, fValueOf3);
                i0Var.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                i0Var.a(4800, fValueOf4);
                i0Var.a(6000, fValueOf4);
                return Unit.f26487a;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                j5.z.m((j5.b0) obj, 3);
                return Unit.f26487a;
            case 16:
                KProperty[] kPropertyArr2 = j5.z.f24734a;
                j5.a0 a0Var2 = j5.x.l;
                KProperty kProperty = j5.z.f24734a[5];
                ((j5.b0) obj).b(a0Var2, Boolean.TRUE);
                return Unit.f26487a;
            case 17:
                return Unit.f26487a;
            case 18:
                return Unit.f26487a;
            case 19:
                return Unit.f26487a;
            case 20:
                return Unit.f26487a;
            case 21:
                List list2 = (List) obj;
                return new ka(((Number) list2.get(0)).floatValue(), ((Number) list2.get(1)).floatValue(), ((Number) list2.get(2)).floatValue());
            case 22:
                ((j5.b0) obj).getClass();
                return Unit.f26487a;
            case 23:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 24:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 25:
                ((CreationExtras) obj).getClass();
                return new g9.q();
            case 26:
                Context context3 = (Context) obj;
                context3.getClass();
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 27:
                Context context4 = (Context) obj;
                context4.getClass();
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 28:
                g9.z zVar = (g9.z) obj;
                zVar.getClass();
                return zVar.f20259c;
            default:
                g9.z zVar2 = (g9.z) obj;
                zVar2.getClass();
                if (!(zVar2 instanceof g9.b0)) {
                    return null;
                }
                i0.w wVar = ((g9.b0) zVar2).f20106g;
                return wVar.u(wVar.f22745b);
        }
    }
}
