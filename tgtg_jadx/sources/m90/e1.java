package m90;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class e1 implements SerialDescriptor, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f29780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f29783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List[] f29784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f29785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f29786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f29787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f29788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f29789k;
    public final Object l;

    public e1(String str, d0 d0Var, int i11) {
        str.getClass();
        this.f29779a = str;
        this.f29780b = d0Var;
        this.f29781c = i11;
        this.f29782d = -1;
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = "[UNINITIALIZED]";
        }
        this.f29783e = strArr;
        int i13 = this.f29781c;
        this.f29784f = new List[i13];
        this.f29786h = new boolean[i13];
        kotlin.collections.o0 o0Var = kotlin.collections.o0.f26530a;
        o0Var.getClass();
        this.f29787i = o0Var;
        u70.m mVar = u70.m.PUBLICATION;
        final int i14 = 0;
        this.f29788j = u70.l.a(mVar, new Function0(this) { // from class: m90.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f29772b;

            {
                this.f29772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i14) {
                    case 0:
                        d0 d0Var2 = this.f29772b.f29780b;
                        return (d0Var2 == null || (kSerializerArrChildSerializers = d0Var2.childSerializers()) == null) ? c1.f29765b : kSerializerArrChildSerializers;
                    case 1:
                        d0 d0Var3 = this.f29772b.f29780b;
                        if (d0Var3 == null || (kSerializerArrTypeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.f29772b;
                        return Integer.valueOf(c1.f(e1Var, (SerialDescriptor[]) e1Var.f29789k.getValue()));
                }
            }
        });
        final int i15 = 1;
        this.f29789k = u70.l.a(mVar, new Function0(this) { // from class: m90.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f29772b;

            {
                this.f29772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i15) {
                    case 0:
                        d0 d0Var2 = this.f29772b.f29780b;
                        return (d0Var2 == null || (kSerializerArrChildSerializers = d0Var2.childSerializers()) == null) ? c1.f29765b : kSerializerArrChildSerializers;
                    case 1:
                        d0 d0Var3 = this.f29772b.f29780b;
                        if (d0Var3 == null || (kSerializerArrTypeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.f29772b;
                        return Integer.valueOf(c1.f(e1Var, (SerialDescriptor[]) e1Var.f29789k.getValue()));
                }
            }
        });
        final int i16 = 2;
        this.l = u70.l.a(mVar, new Function0(this) { // from class: m90.d1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1 f29772b;

            {
                this.f29772b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, u70.j] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i16) {
                    case 0:
                        d0 d0Var2 = this.f29772b.f29780b;
                        return (d0Var2 == null || (kSerializerArrChildSerializers = d0Var2.childSerializers()) == null) ? c1.f29765b : kSerializerArrChildSerializers;
                    case 1:
                        d0 d0Var3 = this.f29772b.f29780b;
                        if (d0Var3 == null || (kSerializerArrTypeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.f29772b;
                        return Integer.valueOf(c1.f(e1Var, (SerialDescriptor[]) e1Var.f29789k.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.f29779a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // m90.l
    public final Set b() {
        return this.f29787i.keySet();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.f29787i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        return this.f29781c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, u70.j] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, u70.j] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.areEqual(this.f29779a, serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.f29789k.getValue(), (SerialDescriptor[]) ((e1) obj).f29789k.getValue())) {
                int iE = serialDescriptor.e();
                int i11 = this.f29781c;
                if (i11 == iE) {
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (Intrinsics.areEqual(h(i12).a(), serialDescriptor.h(i12).a()) && Intrinsics.areEqual(h(i12).getKind(), serialDescriptor.h(i12).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        return this.f29783e[i11];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        List list = this.f29784f[i11];
        return list == null ? kotlin.collections.n0.f26529a : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        ArrayList arrayList = this.f29785g;
        return arrayList == null ? kotlin.collections.n0.f26529a : arrayList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public p30.b getKind() {
        return k90.j.f26240j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor h(int i11) {
        return ((KSerializer[]) this.f29788j.getValue())[i11].getDescriptor();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    public int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        return this.f29786h[i11];
    }

    public final void j(String str, boolean z11) {
        str.getClass();
        int i11 = this.f29782d + 1;
        this.f29782d = i11;
        String[] strArr = this.f29783e;
        strArr[i11] = str;
        this.f29786h[i11] = z11;
        this.f29784f[i11] = null;
        if (i11 == this.f29781c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                map.put(strArr[i12], Integer.valueOf(i12));
            }
            this.f29787i = map;
        }
    }

    public final void k(Annotation annotation) {
        annotation.getClass();
        if (this.f29785g == null) {
            this.f29785g = new ArrayList(1);
        }
        ArrayList arrayList = this.f29785g;
        arrayList.getClass();
        arrayList.add(annotation);
    }

    public String toString() {
        return c1.l(this);
    }
}
