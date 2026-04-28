package w6;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f43254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f43255b;

    public i(Resources resources, Resources.Theme theme) {
        this.f43254a = resources;
        this.f43255b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f43254a.equals(iVar.f43254a) && Objects.equals(this.f43255b, iVar.f43255b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f43254a, this.f43255b);
    }
}
