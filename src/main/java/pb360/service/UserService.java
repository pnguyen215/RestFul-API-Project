package pb360.service;

import java.util.List;

import org.springframework.data.domain.Page;

import pb360.data.entity.UserEntity;
import pb360.model.MessageObject;
import pb360.model.UserModel;

public interface UserService {

	public MessageObject register(UserModel userModel);

	public MessageObject login(String username, UserModel userModel);

	public List<UserEntity> findAllUser();

	public boolean doesExistByUsername(String username);

	public Page<UserEntity> findPaginated(int page, int size, String filter);

}
