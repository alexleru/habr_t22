public class Model<T, Model> {
    T element;
    Model model;

    public Model(T element, Model model) {
        this.element = element;
        this.model = model;
    }
}
