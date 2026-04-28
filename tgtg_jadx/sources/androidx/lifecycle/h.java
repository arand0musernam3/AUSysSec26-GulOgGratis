package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface h extends d0 {
    default void onCreate(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    default void onResume(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    default void onStart(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    default void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    default void onPause(LifecycleOwner lifecycleOwner) {
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
    }
}
