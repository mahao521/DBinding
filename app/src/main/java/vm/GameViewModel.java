package vm;

import android.databinding.Bindable;

import kale.db.BR;
import kale.dbinding.BaseViewModel;
/** Generated code from DBinding. Do not modify! */
public class GameViewModel extends BaseViewModel<GameViewModel> {

    private android.graphics.Bitmap pic;
    public void setPic(android.graphics.Bitmap pic) {
        this.pic = pic;
        notifyPropertyChanged(BR.pic);
    }
    @Bindable public android.graphics.Bitmap getPic() {return this.pic;}

    private android.graphics.Bitmap icon;
    public void setIcon(android.graphics.Bitmap icon) {
        this.icon = icon;
        notifyPropertyChanged(BR.icon);
    }
    @Bindable public android.graphics.Bitmap getIcon() {return this.icon;}

    private java.lang.CharSequence title;
    public void setTitle(java.lang.CharSequence title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
    @Bindable public java.lang.CharSequence getTitle() {return this.title;}

    private java.lang.CharSequence isLikeText;
    public void setIsLikeText(java.lang.CharSequence isLikeText) {
        this.isLikeText = isLikeText;
        notifyPropertyChanged(BR.isLikeText);
    }
    @Bindable public java.lang.CharSequence getIsLikeText() {return this.isLikeText;}}