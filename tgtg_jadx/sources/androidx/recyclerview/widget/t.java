package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public abstract boolean areContentsTheSame(int i11, int i12);

    public abstract boolean areItemsTheSame(int i11, int i12);

    public Object getChangePayload(int i11, int i12) {
        return null;
    }

    public abstract int getNewListSize();

    public abstract int getOldListSize();
}
