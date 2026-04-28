package m90;

import kotlin.Unit;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v70.i f29816a;

    static {
        v70.i iVar = new v70.i();
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(String.class);
        o30.f0.R(StringCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass, r1.f29848a);
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(Character.TYPE);
        CharCompanionObject.INSTANCE.getClass();
        iVar.put(orCreateKotlinClass2, p.f29836a);
        iVar.put(Reflection.getOrCreateKotlinClass(char[].class), o.f29831c);
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(Double.TYPE);
        o30.f0.N(DoubleCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass3, v.f29868a);
        iVar.put(Reflection.getOrCreateKotlinClass(double[].class), u.f29865c);
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(Float.TYPE);
        o30.f0.O(FloatCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass4, c0.f29762a);
        iVar.put(Reflection.getOrCreateKotlinClass(float[].class), b0.f29758c);
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(Long.TYPE);
        o30.f0.Q(LongCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass5, q0.f29842a);
        iVar.put(Reflection.getOrCreateKotlinClass(long[].class), p0.f29838c);
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(u70.c0.class);
        u70.c0.f40833b.getClass();
        iVar.put(orCreateKotlinClass6, b2.f29759a);
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(Integer.TYPE);
        o30.f0.P(IntCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass7, l0.f29821a);
        iVar.put(Reflection.getOrCreateKotlinClass(int[].class), k0.f29818c);
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(u70.z.class);
        u70.z.f40865b.getClass();
        iVar.put(orCreateKotlinClass8, y1.f29889a);
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(Short.TYPE);
        ShortCompanionObject.INSTANCE.getClass();
        iVar.put(orCreateKotlinClass9, q1.f29844a);
        iVar.put(Reflection.getOrCreateKotlinClass(short[].class), p1.f29839c);
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(u70.g0.class);
        u70.g0.f40838b.getClass();
        iVar.put(orCreateKotlinClass10, e2.f29790a);
        KClass orCreateKotlinClass11 = Reflection.getOrCreateKotlinClass(Byte.TYPE);
        ByteCompanionObject.INSTANCE.getClass();
        iVar.put(orCreateKotlinClass11, j.f29812a);
        iVar.put(Reflection.getOrCreateKotlinClass(byte[].class), i.f29807c);
        KClass orCreateKotlinClass12 = Reflection.getOrCreateKotlinClass(u70.w.class);
        u70.w.f40862b.getClass();
        iVar.put(orCreateKotlinClass12, v1.f29870a);
        KClass orCreateKotlinClass13 = Reflection.getOrCreateKotlinClass(Boolean.TYPE);
        o30.f0.M(BooleanCompanionObject.INSTANCE);
        iVar.put(orCreateKotlinClass13, g.f29797a);
        iVar.put(Reflection.getOrCreateKotlinClass(boolean[].class), f.f29792c);
        KClass orCreateKotlinClass14 = Reflection.getOrCreateKotlinClass(Unit.class);
        Unit.f26487a.getClass();
        iVar.put(orCreateKotlinClass14, f2.f29795b);
        iVar.put(Reflection.getOrCreateKotlinClass(Void.class), x0.f29882a);
        try {
            KClass orCreateKotlinClass15 = Reflection.getOrCreateKotlinClass(p80.d.class);
            p80.d.f34559b.getClass();
            iVar.put(orCreateKotlinClass15, w.f29872a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            iVar.put(Reflection.getOrCreateKotlinClass(u70.d0.class), a2.f29757c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            iVar.put(Reflection.getOrCreateKotlinClass(u70.a0.class), x1.f29884c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            iVar.put(Reflection.getOrCreateKotlinClass(u70.h0.class), d2.f29773c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            iVar.put(Reflection.getOrCreateKotlinClass(u70.x.class), u1.f29867c);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            iVar.put(Reflection.getOrCreateKotlinClass(q80.a.class), g2.f29801a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            KClass orCreateKotlinClass16 = Reflection.getOrCreateKotlinClass(p80.l.class);
            p80.l lVar = p80.l.f34565c;
            iVar.put(orCreateKotlinClass16, i0.f29808a);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        f29816a = iVar.b();
    }
}
