package zendesk.guidekit.android.internal.data;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ArticleInMemoryDataSource_Factory implements c {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class InstanceHolder {
        static final ArticleInMemoryDataSource_Factory INSTANCE = new ArticleInMemoryDataSource_Factory();

        private InstanceHolder() {
        }
    }

    public static ArticleInMemoryDataSource_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ArticleInMemoryDataSource newInstance() {
        return new ArticleInMemoryDataSource();
    }

    @Override // t70.a
    public ArticleInMemoryDataSource get() {
        return newInstance();
    }
}
