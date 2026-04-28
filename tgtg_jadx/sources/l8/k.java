package l8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.lifecycle.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f27466a;

    public k(EmojiCompatInitializer emojiCompatInitializer, Lifecycle lifecycle) {
        this.f27466a = lifecycle;
    }

    @Override // androidx.lifecycle.h
    public final void onResume(LifecycleOwner lifecycleOwner) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new n(0), 500L);
        this.f27466a.d(this);
    }
}
