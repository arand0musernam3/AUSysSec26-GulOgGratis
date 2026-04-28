package zendesk.ui.android.conversation.imagecell;

import kotlin.jvm.functions.Function1;
import zendesk.ui.android.conversation.textcell.TextCellRendering;
import zendesk.ui.android.conversation.textcell.TextCellState;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47876a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageCellState f47877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageCellView f47878c;

    public /* synthetic */ a(ImageCellState imageCellState, ImageCellView imageCellView) {
        this.f47877b = imageCellState;
        this.f47878c = imageCellView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47876a) {
            case 0:
                return ImageCellView.render$lambda$13$lambda$4(this.f47878c, this.f47877b, (TextCellRendering) obj);
            default:
                return ImageCellView.render$lambda$13$lambda$4$lambda$3(this.f47877b, this.f47878c, (TextCellState) obj);
        }
    }

    public /* synthetic */ a(ImageCellView imageCellView, ImageCellState imageCellState) {
        this.f47878c = imageCellView;
        this.f47877b = imageCellState;
    }
}
