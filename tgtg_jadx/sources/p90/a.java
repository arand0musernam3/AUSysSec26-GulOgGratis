package p90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f34620a;

    public a(KSerializer kSerializer) {
        kSerializer.getClass();
        this.f34620a = kSerializer;
    }

    @Override // p90.c
    public final KSerializer a(List list) {
        list.getClass();
        return this.f34620a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && Intrinsics.areEqual(((a) obj).f34620a, this.f34620a);
    }

    public final int hashCode() {
        return this.f34620a.hashCode();
    }
}
