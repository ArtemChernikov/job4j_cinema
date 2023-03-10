package ru.job4j.cinema.model;

import java.util.Objects;

/**
 * Класс описывает модель файла-постера к фильму
 *
 * @author Artem Chernikov
 * @version 1.0
 * @since 09.02.2023
 */
public class File {

    private int id;

    private String name;

    /**
     * Поле путь к файлу
     */
    private String path;

    public File(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        File file = (File) o;
        return id == file.id && Objects.equals(path, file.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, path);
    }
}
