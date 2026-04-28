package oa0;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f32312y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Pattern f32313z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f32314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f32315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f32316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[] f32317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Annotation[][] f32318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Type[] f32319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f32321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f32323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32324k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32325m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32326n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f32327o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f32328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f32329q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f32330r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f32331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public q90.t f32332t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q90.z f32333u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinkedHashSet f32334v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public u0[] f32335w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f32336x;

    public l0(o0 o0Var, Class cls, Method method) {
        this.f32314a = o0Var;
        this.f32315b = cls;
        this.f32316c = method;
        this.f32317d = method.getAnnotations();
        this.f32319f = method.getGenericParameterTypes();
        this.f32318e = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z11) {
        String str3 = this.f32327o;
        Method method = this.f32316c;
        if (str3 != null) {
            throw u0.m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f32327o = str;
        this.f32328p = z11;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f32312y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw u0.m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f32331s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f32334v = linkedHashSet;
    }

    public final void c(int i11, Type type) {
        if (u0.j(type)) {
            throw u0.n(this.f32316c, i11, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
