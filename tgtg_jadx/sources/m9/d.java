package m9;

import a3.u1;
import android.os.Parcelable;
import com.google.firebase.messaging.a0;
import g9.l0;
import g9.n0;
import g9.p0;
import g9.q0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.bouncycastle.iana.AEADAlgorithm;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f29732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f29733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f29734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f29735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f29736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f29737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f29738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f29739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f29740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f29741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f29742k;

    static {
        boolean z11 = true;
        f29732a = new k(z11, 5);
        f29733b = new k(z11, 1);
        boolean z12 = false;
        f29734c = new k(z12, 3);
        f29735d = new k(z11, 2);
        f29736e = new k(z11, 4);
        f29737f = new k(z11, 6);
        f29738g = new k(z12, 7);
        f29739h = new c(z11, 2);
        f29740i = new c(z11, 3);
        f29741j = new c(z11, 0);
        f29742k = new c(z11, 1);
    }

    public static final q0 a(SerialDescriptor serialDescriptor, Map map) {
        Object next;
        q0 q0Var;
        boolean zAreEqual;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            KType kType = (KType) next;
            serialDescriptor.getClass();
            kType.getClass();
            if (serialDescriptor.c() != kType.isMarkedNullable()) {
                zAreEqual = false;
            } else {
                KSerializer kSerializerJ = ba0.g.J(p90.d.f34621a, kType);
                if (kSerializerJ == null) {
                    y.j("Cannot find KSerializer for [", serialDescriptor.a(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                zAreEqual = Intrinsics.areEqual(serialDescriptor, kSerializerJ.getDescriptor());
            }
            if (zAreEqual) {
                break;
            }
        }
        KType kType2 = (KType) next;
        q0 n0Var = kType2 != null ? (q0) map.get(kType2) : null;
        if (n0Var == null) {
            n0Var = null;
        }
        k kVar = k.f29752s;
        if (n0Var == null) {
            serialDescriptor.getClass();
            e eVarG = g(serialDescriptor);
            int[] iArr = f.$EnumSwitchMapping$0;
            switch (iArr[eVarG.ordinal()]) {
                case 1:
                    q0Var = f29738g;
                    n0Var = q0Var;
                    break;
                case 2:
                    q0Var = q0.f20208o;
                    n0Var = q0Var;
                    break;
                case 3:
                    q0Var = q0.f20196b;
                    n0Var = q0Var;
                    break;
                case 4:
                    q0Var = q0.l;
                    n0Var = q0Var;
                    break;
                case 5:
                    q0Var = f29734c;
                    n0Var = q0Var;
                    break;
                case 6:
                    q0Var = q0.f20203i;
                    n0Var = q0Var;
                    break;
                case 7:
                    q0Var = q0.f20200f;
                    n0Var = q0Var;
                    break;
                case 8:
                    Class clsE = e(serialDescriptor);
                    n0Var = Parcelable.class.isAssignableFrom(clsE) ? new n0(clsE) : Enum.class.isAssignableFrom(clsE) ? new l0(clsE) : Serializable.class.isAssignableFrom(clsE) ? new p0(clsE) : null;
                    if (n0Var == null) {
                        n0Var = kVar;
                    }
                    break;
                case 9:
                    q0Var = f29732a;
                    n0Var = q0Var;
                    break;
                case 10:
                    q0Var = f29733b;
                    n0Var = q0Var;
                    break;
                case 11:
                    q0Var = f29735d;
                    n0Var = q0Var;
                    break;
                case 12:
                    q0Var = f29736e;
                    n0Var = q0Var;
                    break;
                case 13:
                    q0Var = f29737f;
                    n0Var = q0Var;
                    break;
                case 14:
                    q0Var = q0.f20198d;
                    n0Var = q0Var;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    q0Var = q0.f20206m;
                    n0Var = q0Var;
                    break;
                case 16:
                    q0Var = f29741j;
                    n0Var = q0Var;
                    break;
                case 17:
                    q0Var = q0.f20204j;
                    n0Var = q0Var;
                    break;
                case 18:
                    q0Var = q0.f20201g;
                    n0Var = q0Var;
                    break;
                case 19:
                    int i11 = iArr[g(serialDescriptor.h(0)).ordinal()];
                    if (i11 == 1) {
                        q0Var = q0.f20209p;
                    } else if (i11 != 2) {
                        n0Var = kVar;
                    } else {
                        q0Var = f29739h;
                    }
                    n0Var = q0Var;
                    break;
                case 20:
                    switch (iArr[g(serialDescriptor.h(0)).ordinal()]) {
                        case 1:
                            q0Var = q0.f20210q;
                            n0Var = q0Var;
                            break;
                        case 2:
                            q0Var = f29740i;
                            n0Var = q0Var;
                            break;
                        case 3:
                            q0Var = q0.f20199e;
                            n0Var = q0Var;
                            break;
                        case 4:
                            q0Var = q0.f20207n;
                            n0Var = q0Var;
                            break;
                        case 5:
                            q0Var = f29742k;
                            n0Var = q0Var;
                            break;
                        case 6:
                            q0Var = q0.f20205k;
                            n0Var = q0Var;
                            break;
                        case 7:
                            q0Var = q0.f20202h;
                            n0Var = q0Var;
                            break;
                        case 8:
                            n0Var = new a(e(serialDescriptor.h(0)));
                            break;
                        default:
                            n0Var = kVar;
                            break;
                    }
                    break;
                case 21:
                    Class clsE2 = e(serialDescriptor);
                    n0Var = !Enum.class.isAssignableFrom(clsE2) ? kVar : new b(clsE2);
                    break;
                default:
                    n0Var = kVar;
                    break;
            }
        }
        if (Intrinsics.areEqual(n0Var, kVar)) {
            return null;
        }
        return n0Var;
    }

    public static final int b(KSerializer kSerializer) {
        int iHashCode = kSerializer.getDescriptor().a().hashCode();
        int iE = kSerializer.getDescriptor().e();
        for (int i11 = 0; i11 < iE; i11++) {
            iHashCode = (iHashCode * 31) + kSerializer.getDescriptor().f(i11).hashCode();
        }
        return iHashCode;
    }

    public static final ArrayList c(KSerializer kSerializer, Map map) {
        map.getClass();
        if (kSerializer instanceof i90.d) {
            j4.d.m("Cannot generate NavArguments for polymorphic serializer ", kSerializer, ". Arguments can only be generated from concrete classes or objects.");
            return null;
        }
        int iE = kSerializer.getDescriptor().e();
        ArrayList arrayList = new ArrayList(iE);
        for (int i11 = 0; i11 < iE; i11++) {
            String strF = kSerializer.getDescriptor().f(i11);
            strF.getClass();
            g9.i iVar = new g9.i();
            SerialDescriptor serialDescriptorH = kSerializer.getDescriptor().h(i11);
            boolean zC = serialDescriptorH.c();
            q0 q0VarA = a(serialDescriptorH, map);
            if (q0VarA == null) {
                i4.a.f(h(strF, serialDescriptorH.a(), kSerializer.getDescriptor().a(), map.toString()));
                return null;
            }
            iVar.f20136d = q0VarA;
            iVar.f20133a = zC;
            if (kSerializer.getDescriptor().i(i11)) {
                iVar.f20135c = true;
            }
            arrayList.add(new g9.g(strF, iVar.a()));
        }
        return arrayList;
    }

    public static final String d(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        KSerializer kSerializerI = ba0.g.I(Reflection.getOrCreateKotlinClass(obj.getClass()));
        j jVar = new j(kSerializerI, linkedHashMap);
        kSerializerI.serialize(jVar, obj);
        Map mapK = x0.k(jVar.f29750i);
        a0 a0Var = new a0(kSerializerI);
        u1 u1Var = new u1(26, mapK, a0Var);
        int iE = kSerializerI.getDescriptor().e();
        for (int i11 = 0; i11 < iE; i11++) {
            String strF = kSerializerI.getDescriptor().f(i11);
            q0 q0Var = (q0) linkedHashMap.get(strF);
            if (q0Var == null) {
                e40.a.g(e0.f.g(']', "Cannot locate NavType for argument [", strF));
                return null;
            }
            u1Var.invoke(Integer.valueOf(i11), strF, q0Var);
        }
        return ((String) a0Var.f12779b) + ((String) a0Var.f12781d) + ((String) a0Var.f12782e);
    }

    public static final Class e(SerialDescriptor serialDescriptor) {
        String strN = kotlin.text.y.n(serialDescriptor.a(), "?", "", false);
        try {
            return Class.forName(strN);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.z(strN, ".", false)) {
                return Class.forName(new Regex("(\\.+)(?!.*\\.)").replace(strN, "\\$"));
            }
            String strConcat = "Cannot find class with name \"" + serialDescriptor.a() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getKind() instanceof k90.i) {
                strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            i4.a.f(strConcat);
            return null;
        }
    }

    public static final boolean f(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return Intrinsics.areEqual(serialDescriptor.getKind(), k90.j.f26240j) && serialDescriptor.isInline() && serialDescriptor.e() == 1;
    }

    public static final e g(SerialDescriptor serialDescriptor) {
        String strN = kotlin.text.y.n(serialDescriptor.a(), "?", "", false);
        return Intrinsics.areEqual(serialDescriptor.getKind(), k90.i.f26239j) ? serialDescriptor.c() ? e.ENUM_NULLABLE : e.ENUM : Intrinsics.areEqual(strN, "kotlin.Int") ? serialDescriptor.c() ? e.INT_NULLABLE : e.INT : Intrinsics.areEqual(strN, "kotlin.Boolean") ? serialDescriptor.c() ? e.BOOL_NULLABLE : e.BOOL : Intrinsics.areEqual(strN, "kotlin.Double") ? serialDescriptor.c() ? e.DOUBLE_NULLABLE : e.DOUBLE : Intrinsics.areEqual(strN, "kotlin.Float") ? serialDescriptor.c() ? e.FLOAT_NULLABLE : e.FLOAT : Intrinsics.areEqual(strN, "kotlin.Long") ? serialDescriptor.c() ? e.LONG_NULLABLE : e.LONG : Intrinsics.areEqual(strN, "kotlin.String") ? serialDescriptor.c() ? e.STRING_NULLABLE : e.STRING : Intrinsics.areEqual(strN, "kotlin.IntArray") ? e.INT_ARRAY : Intrinsics.areEqual(strN, "kotlin.DoubleArray") ? e.DOUBLE_ARRAY : Intrinsics.areEqual(strN, "kotlin.BooleanArray") ? e.BOOL_ARRAY : Intrinsics.areEqual(strN, "kotlin.FloatArray") ? e.FLOAT_ARRAY : Intrinsics.areEqual(strN, "kotlin.LongArray") ? e.LONG_ARRAY : Intrinsics.areEqual(strN, "kotlin.Array") ? e.ARRAY : kotlin.text.y.p(strN, "kotlin.collections.ArrayList", false) ? e.LIST : e.UNKNOWN;
    }

    public static final String h(String str, String str2, String str3, String str4) {
        return e0.f.n(e0.f.t("Route ", str3, " could not find any NavType for argument ", str, " of type "), str2, " - typeMap received was ", str4);
    }
}
