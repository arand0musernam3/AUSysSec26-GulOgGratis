package zendesk.guidekit.android.internal;

import s70.c;
import zendesk.guidekit.android.internal.data.GuideKitRepository;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class DefaultGuideKit_Factory implements c {
    private final c guideKitRepositoryProvider;

    private DefaultGuideKit_Factory(c cVar) {
        this.guideKitRepositoryProvider = cVar;
    }

    public static DefaultGuideKit_Factory create(c cVar) {
        return new DefaultGuideKit_Factory(cVar);
    }

    public static DefaultGuideKit newInstance(GuideKitRepository guideKitRepository) {
        return new DefaultGuideKit(guideKitRepository);
    }

    @Override // t70.a
    public DefaultGuideKit get() {
        return newInstance((GuideKitRepository) this.guideKitRepositoryProvider.get());
    }
}
