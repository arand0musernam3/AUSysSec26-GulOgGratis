package l80;

import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends l80.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f27501c = new a();

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // l80.a
    public final Random g() {
        Object obj = this.f27501c.get();
        obj.getClass();
        return (Random) obj;
    }
}
