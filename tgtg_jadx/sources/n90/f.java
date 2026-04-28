package n90;

import java.util.List;
import kotlin.collections.n0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements SerialDescriptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f30759b = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f30760c = "kotlinx.serialization.json.JsonArray";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m90.c f30761a;

    public f() {
        SerialDescriptor descriptor = q.f30781a.getDescriptor();
        descriptor.getClass();
        this.f30761a = new m90.c(descriptor, 1);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return f30760c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        this.f30761a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        str.getClass();
        return this.f30761a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int e() {
        this.f30761a.getClass();
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String f(int i11) {
        this.f30761a.getClass();
        return String.valueOf(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List g(int i11) {
        return this.f30761a.g(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        this.f30761a.getClass();
        return n0.f26529a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final p30.b getKind() {
        this.f30761a.getClass();
        return k90.j.f26241k;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor h(int i11) {
        return this.f30761a.h(i11);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean i(int i11) {
        this.f30761a.i(i11);
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        this.f30761a.getClass();
        return false;
    }
}
