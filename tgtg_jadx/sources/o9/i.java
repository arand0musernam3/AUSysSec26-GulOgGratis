package o9;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f32141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f32142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f32143d;

    public i(ArrayList arrayList, ArrayList arrayList2, d dVar, ArrayList arrayList3) {
        this.f32140a = arrayList;
        this.f32141b = arrayList2;
        this.f32142c = dVar;
        this.f32143d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.areEqual(this.f32140a, iVar.f32140a) && Intrinsics.areEqual(this.f32141b, iVar.f32141b) && Intrinsics.areEqual(this.f32142c, iVar.f32142c) && Intrinsics.areEqual(this.f32143d, iVar.f32143d);
    }

    public final int hashCode() {
        return (this.f32143d.hashCode() * 31) + (this.f32142c.hashCode() * 31) + (this.f32141b.hashCode() * 31) + (this.f32140a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.f32140a + ", overlayScenes=" + this.f32141b + ", currentScene=" + this.f32142c + ", previousScenes=" + this.f32143d + ')';
    }
}
