package g90;

import i90.h;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h(with = h90.a.class)
@SourceDebugExtension({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,190:1\n720#2,2:191\n*S KotlinDebug\n*F\n+ 1 Instant.kt\nkotlinx/datetime/Instant\n*L\n37#1:191,2\n*E\n"})
public final class b implements Comparable<b> {

    @NotNull
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f20262a;

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        instantOfEpochSecond.getClass();
        new b(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        instantOfEpochSecond2.getClass();
        new b(instantOfEpochSecond2);
        Instant instant = Instant.MIN;
        instant.getClass();
        new b(instant);
        Instant instant2 = Instant.MAX;
        instant2.getClass();
        new b(instant2);
    }

    public b(Instant instant) {
        instant.getClass();
        this.f20262a = instant;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        return this.f20262a.compareTo(bVar2.f20262a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return Intrinsics.areEqual(this.f20262a, ((b) obj).f20262a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20262a.hashCode();
    }

    public final String toString() {
        String string = this.f20262a.toString();
        string.getClass();
        return string;
    }
}
