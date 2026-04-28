package n90;

import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.r1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f30753b = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30754c = "kotlinx.serialization.json.JsonObject";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m90.e0 f30755a;

    public d0() {
        o30.f0.R(StringCompanionObject.INSTANCE);
        this.f30755a = o30.f0.j(r1.f29848a, q.f30781a).f29794d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f30754c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.f30755a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.f30755a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        this.f30755a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        this.f30755a.getClass();
        return String.valueOf(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return this.f30755a.g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f30755a.getClass();
        return n0.f26529a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        this.f30755a.getClass();
        return k90.j.l;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return this.f30755a.h(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        this.f30755a.i(i11);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f30755a.getClass();
        return false;
    }
}
