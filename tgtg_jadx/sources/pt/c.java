package pt;

import android.os.SystemClock;
import android.view.View;
import androidx.core.util.Consumer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f35622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f35623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function1 f35624c;

    public c(Consumer consumer) {
        this.f35623b = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (SystemClock.elapsedRealtime() - this.f35622a < 1000) {
            return;
        }
        this.f35622a = SystemClock.elapsedRealtime();
        Consumer consumer = this.f35623b;
        if (consumer != null) {
            consumer.accept(view);
        }
        Function1 function1 = this.f35624c;
        if (function1 != null) {
            function1.invoke(view);
        }
    }
}
