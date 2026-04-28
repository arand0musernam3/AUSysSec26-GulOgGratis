package g9;

import a3.m2;
import com.google.android.gms.internal.measurement.o7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import y00.w0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f20099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f20100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f20101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f20102f;

    public a0(t0 t0Var, KClass kClass, Map map) {
        map.getClass();
        int iB = kClass != null ? m9.d.b(ba0.g.I(kClass)) : -1;
        if (kClass != null) {
            KSerializer kSerializerI = ba0.g.I(kClass);
            if (kSerializerI instanceof i90.d) {
                StringBuilder sb2 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                KClass kClassA = o30.f0.A(((i90.d) kSerializerI).getDescriptor());
                throw new IllegalArgumentException(r8.k.p(sb2, kClassA != null ? kClassA.getSimpleName() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(kSerializerI);
            m2 m2Var = new m2(a0Var, 18);
            int iE = kSerializerI.getDescriptor().e();
            for (int i11 = 0; i11 < iE; i11++) {
                String strF = kSerializerI.getDescriptor().f(i11);
                q0 q0VarA = m9.d.a(kSerializerI.getDescriptor().h(i11), map);
                if (q0VarA == null) {
                    i4.a.f(m9.d.h(strF, kSerializerI.getDescriptor().h(i11).a(), kSerializerI.getDescriptor().a(), map.toString()));
                    throw null;
                }
                m2Var.invoke(Integer.valueOf(i11), strF, q0VarA);
            }
            str = ((String) a0Var.f12779b) + ((String) a0Var.f12781d) + ((String) a0Var.f12782e);
        }
        this(t0Var, iB, str);
        if (kClass != null) {
            for (g gVar : m9.d.c(ba0.g.I(kClass), map)) {
                ((LinkedHashMap) this.f20100d).put(gVar.f20116a, gVar.f20117b);
            }
        }
    }

    public static Boolean f(Boolean bool, boolean z11) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean g(String str, o7 o7Var, w0 w0Var) {
        List listY;
        com.google.android.gms.common.internal.i0.h(o7Var);
        if (str != null && o7Var.t() && o7Var.B() != 1 && (o7Var.B() != 7 ? o7Var.u() : o7Var.z() != 0)) {
            int iB = o7Var.B();
            boolean zX = o7Var.x();
            String strV = (zX || iB == 2 || iB == 7) ? o7Var.v() : o7Var.v().toUpperCase(Locale.ENGLISH);
            if (o7Var.z() == 0) {
                listY = null;
            } else {
                listY = o7Var.y();
                if (!zX) {
                    ArrayList arrayList = new ArrayList(listY.size());
                    Iterator it = listY.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listY = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iB == 2 ? strV : null;
            if (iB != 7 ? strV != null : listY != null && !listY.isEmpty()) {
                if (!zX && iB != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iB - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zX ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (w0Var != null) {
                                    w0Var.f45263j.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strV));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strV));
                    case 4:
                        return Boolean.valueOf(str.contains(strV));
                    case 5:
                        return Boolean.valueOf(str.equals(strV));
                    case 6:
                        if (listY != null) {
                            return Boolean.valueOf(listY.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.l7 r9, double r10) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.a0.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.l7, double):java.lang.Boolean");
    }

    public z a() {
        z zVarB = b();
        zVarB.f20260d = null;
        l9.h hVar = zVarB.f20258b;
        for (Map.Entry entry : ((LinkedHashMap) this.f20100d).entrySet()) {
            String str = (String) entry.getKey();
            j jVar = (j) entry.getValue();
            str.getClass();
            jVar.getClass();
            hVar.getClass();
            hVar.f27562d.put(str, jVar);
        }
        Iterator it = ((ArrayList) this.f20102f).iterator();
        while (it.hasNext()) {
            zVarB.b((v) it.next());
        }
        for (Map.Entry entry2 : ((LinkedHashMap) this.f20101e).entrySet()) {
            zVarB.l(((Number) entry2.getKey()).intValue(), (h) entry2.getValue());
        }
        String str2 = this.f20097a;
        if (str2 != null) {
            zVarB.m(str2);
        }
        int i11 = this.f20098b;
        if (i11 != -1) {
            hVar.f27563e = i11;
            hVar.f27560b = null;
        }
        return zVarB;
    }

    public z b() {
        return ((t0) this.f20099c).a();
    }

    public abstract int c();

    public abstract boolean d();

    public abstract boolean e();

    public a0(t0 t0Var, int i11, String str) {
        this.f20099c = t0Var;
        this.f20098b = i11;
        this.f20097a = str;
        this.f20100d = new LinkedHashMap();
        this.f20102f = new ArrayList();
        this.f20101e = new LinkedHashMap();
    }

    public a0(String str, int i11) {
        this.f20097a = str;
        this.f20098b = i11;
    }
}
