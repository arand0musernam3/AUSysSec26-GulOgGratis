package androidx.lifecycle;

import android.app.Application;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends l1 {

    @NotNull
    private final Application application;

    public b(Application application) {
        application.getClass();
        this.application = application;
    }

    @NotNull
    public <T extends Application> T getApplication() {
        T t9 = (T) this.application;
        t9.getClass();
        return t9;
    }
}
