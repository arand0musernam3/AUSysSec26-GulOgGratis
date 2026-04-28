package rl;

import i90.h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
public final class d extends f {

    @NotNull
    public static final d INSTANCE = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Object f38133b = l.a(m.PUBLICATION, new rg.m(2));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof d);
    }

    public final int hashCode() {
        return 641854131;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f38133b.getValue();
    }

    public final String toString() {
        return "EmailLoginScreen";
    }
}
