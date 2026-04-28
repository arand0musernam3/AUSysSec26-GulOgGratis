package defpackage;

import al.h;
import am.i;
import am.l;
import android.view.View;
import c5.o2;
import cl.a;
import cl.b;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.badge.BadgeCTADestination;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.Item;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.app.tgtg.model.remote.user.response.charity.CharityDayScheduleStore;
import cv.e;
import d2.m2;
import g9.c0;
import g9.x;
import g9.z;
import i4.g0;
import i80.o;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import lv.s;
import m3.n;
import org.bouncycastle.iana.AEADAlgorithm;
import pm.j;
import w.a0;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f13652b;

    public /* synthetic */ d(Function1 function1, int i11) {
        this.f13651a = i11;
        this.f13652b = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f13651a;
        Object[] objArr = 0;
        final Function1 function1 = this.f13652b;
        switch (i11) {
            case 0:
                h hVar = (h) obj;
                hVar.getClass();
                if (hVar == h.Other) {
                    function1.invoke(a.f8441c);
                } else {
                    function1.invoke(new b(hVar));
                }
                break;
            case 1:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                final Object[] objArr2 = objArr == true ? 1 : 0;
                final int i12 = 1;
                u3.d dVar = new u3.d(new o() { // from class: am.a
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i13 = objArr2;
                        n nVar = (n) obj4;
                        a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                        switch (i13) {
                            case 0:
                                zl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            case 1:
                                yl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            default:
                                bm.a.e(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, -45152277);
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                n0 n0Var = n0.f26529a;
                f.l(c0Var, Reflection.getOrCreateKotlinClass(i.class), o0Var, n0Var, null, null, null, null, dVar);
                f.l(c0Var, Reflection.getOrCreateKotlinClass(am.f.class), o0Var, n0Var, null, null, null, null, new u3.d(new o() { // from class: am.a
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i13 = i12;
                        n nVar = (n) obj4;
                        a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                        switch (i13) {
                            case 0:
                                zl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            case 1:
                                yl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            default:
                                bm.a.e(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, 1030905428));
                final int i13 = 2;
                f.l(c0Var, Reflection.getOrCreateKotlinClass(l.class), o0Var, n0Var, null, null, null, null, new u3.d(new o() { // from class: am.a
                    @Override // i80.o
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i132 = i13;
                        n nVar = (n) obj4;
                        a0.A((Integer) obj5, (s1.l) obj2, (g9.l) obj3);
                        switch (i132) {
                            case 0:
                                zl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            case 1:
                                yl.a.c(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                            default:
                                bm.a.e(v1.n.j(m2.f13850c, s.I, g0.f23254b), null, function1, nVar, 6);
                                break;
                        }
                        return Unit.f26487a;
                    }
                }, true, -1384535245));
                break;
            case 2:
                Object obj2 = (ItemTagInfo) obj;
                obj2.getClass();
                function1.invoke(obj2);
                break;
            case 3:
                Object tag = ((View) obj).getTag(R.id.binding_reference);
                tag.getClass();
                function1.invoke((sa.a) tag);
                break;
            case 4:
                Integer num = (Integer) obj;
                num.intValue();
                if (function1 != null) {
                    function1.invoke(num);
                }
                break;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
            case 7:
                Object obj3 = (String) obj;
                obj3.getClass();
                function1.invoke(obj3);
                break;
            case 8:
                Object obj4 = (String) obj;
                obj4.getClass();
                function1.invoke(obj4);
                break;
            case 9:
                o2 o2Var = (o2) obj;
                o2Var.f7307a = "offset";
                o2Var.f7309c.b(function1, "offset");
                break;
            case 10:
                Object obj5 = (String) obj;
                obj5.getClass();
                function1.invoke(obj5);
                break;
            case 11:
                Object obj6 = (BasicItem) obj;
                obj6.getClass();
                function1.invoke(obj6);
                break;
            case 12:
                Object obj7 = (e) obj;
                obj7.getClass();
                if (function1 != null) {
                    function1.invoke(obj7);
                }
                break;
            case 13:
                break;
            case 14:
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            case 16:
                break;
            case 17:
                s1.s sVar = (s1.s) obj;
                z zVar = ((g9.l) sVar.c()).f20163b;
                zVar.getClass();
                int i14 = z.f20256f;
                for (z zVar2 : x.b((i9.h) zVar)) {
                }
                if (function1 != null) {
                }
                break;
            case 18:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                function1.invoke(bool3);
                break;
            case 19:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                function1.invoke(bool4);
                break;
            case 20:
                Integer num2 = (Integer) obj;
                num2.intValue();
                function1.invoke(num2);
                break;
            case 21:
                Integer num3 = (Integer) obj;
                num3.intValue();
                function1.invoke(num3);
                break;
            case 22:
                Object obj8 = (BadgeCTADestination) obj;
                obj8.getClass();
                function1.invoke(obj8);
                break;
            case 23:
                Object obj9 = (Item) obj;
                obj9.getClass();
                function1.invoke(obj9);
                break;
            case 24:
                Object obj10 = (String) obj;
                obj10.getClass();
                function1.invoke(obj10);
                break;
            case 25:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                function1.invoke(bool5);
                break;
            case 26:
                Object obj11 = (CharityDayScheduleStore) obj;
                obj11.getClass();
                function1.invoke(obj11);
                break;
            case 27:
                Object obj12 = (j) obj;
                obj12.getClass();
                j jVar = j.Hidden;
                break;
            case 28:
                Object obj13 = (SpecialReward) obj;
                obj13.getClass();
                function1.invoke(obj13);
                break;
            default:
                Object obj14 = (SpecialReward) obj;
                obj14.getClass();
                function1.invoke(obj14);
                break;
        }
        return Unit.f26487a;
    }
}
