package nq;

import com.app.tgtg.R;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    public static final int $stable = 8;
    private boolean isLoyaltyCardPromo;
    private boolean isManufacturer;

    @NotNull
    private final String title = "";
    private final int layoutFile = R.layout.discover_bucket_view;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass();
    }

    public int getLayoutFile() {
        return this.layoutFile;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(getLayoutFile()), Boolean.valueOf(this.isManufacturer), getTitle());
    }

    public final boolean isLoyaltyCardPromo() {
        return this.isLoyaltyCardPromo;
    }

    public final boolean isManufacturer() {
        return this.isManufacturer;
    }

    public final void setLoyaltyCardPromo(boolean z11) {
        this.isLoyaltyCardPromo = z11;
    }

    public final void setManufacturer(boolean z11) {
        this.isManufacturer = z11;
    }
}
