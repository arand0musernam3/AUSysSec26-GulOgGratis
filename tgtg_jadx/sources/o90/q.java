package o90;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.x0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n90.b0 f32191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f32192k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32193m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n90.c cVar, n90.b0 b0Var) {
        super(cVar, b0Var, (String) null, 12);
        cVar.getClass();
        this.f32191j = b0Var;
        List listR0 = CollectionsKt.r0(b0Var.f30747a.keySet());
        this.f32192k = listR0;
        this.l = listR0.size() * 2;
        this.f32193m = -1;
    }

    @Override // o90.o, o90.a
    public final n90.n E(String str) {
        str.getClass();
        return this.f32193m % 2 == 0 ? n90.o.b(str) : (n90.n) x0.c(str, this.f32191j);
    }

    @Override // o90.o, o90.a
    public final String Q(SerialDescriptor serialDescriptor, int i11) {
        serialDescriptor.getClass();
        return (String) this.f32192k.get(i11 / 2);
    }

    @Override // o90.o, o90.a
    public final n90.n S() {
        return this.f32191j;
    }

    @Override // o90.o
    /* JADX INFO: renamed from: X */
    public final n90.b0 S() {
        return this.f32191j;
    }

    @Override // o90.o, o90.a, l90.a
    public final void b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // o90.o, l90.a
    public final int w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        int i11 = this.f32193m;
        if (i11 >= this.l - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.f32193m = i12;
        return i12;
    }
}
