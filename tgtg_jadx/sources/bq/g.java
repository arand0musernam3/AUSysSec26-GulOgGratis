package bq;

import android.widget.LinearLayout;
import c6.y;
import com.app.tgtg.model.remote.item.StoreInformation;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public StoreInformation f6593a;

    public abstract void a(StoreInformation storeInformation, y yVar, zp.b bVar);

    @Nullable
    public final StoreInformation getStore() {
        return this.f6593a;
    }

    public final void setStore(@Nullable StoreInformation storeInformation) {
        this.f6593a = storeInformation;
    }
}
